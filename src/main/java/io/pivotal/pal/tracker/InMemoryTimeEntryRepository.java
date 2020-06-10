package io.pivotal.pal.tracker;

import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    private Long id = 1L;

    Map<Long,TimeEntry> timeEntryMap = new HashMap<>();

    @Override
    public TimeEntry find(long timeEntryId) {

        return timeEntryMap.get(timeEntryId);
    }

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        TimeEntry newTimeEntry = new TimeEntry();
        newTimeEntry.setId(id++);
        newTimeEntry.setProjectId(timeEntry.getProjectId());
        newTimeEntry.setHours(timeEntry.getHours());
        newTimeEntry.setDate(timeEntry.getDate());
        newTimeEntry.setUserId(timeEntry.getUserId());

        timeEntryMap.put(newTimeEntry.getId(),newTimeEntry);
        return newTimeEntry;
    }

    @Override
    public List<TimeEntry> list() {
        List<TimeEntry> timeEntries = new ArrayList<>();

       timeEntryMap.forEach((aLong, timeEntry) -> {
           timeEntries.add(timeEntry);
       });
        return timeEntries;
    }

    @Override
    public TimeEntry update(long eq, TimeEntry updatedTimeEntry) {

       TimeEntry timeEntry = timeEntryMap.get(eq);
       if(timeEntry==null){
           return null;
       }
       timeEntry.setUserId(updatedTimeEntry.getUserId());
       timeEntry.setDate(updatedTimeEntry.getDate());
       timeEntry.setHours(updatedTimeEntry.getHours());
       timeEntry.setId(eq);
       timeEntry.setProjectId(updatedTimeEntry.getProjectId());
       timeEntryMap.put(eq,timeEntry);
       return timeEntry;
    }

    @Override
    public void delete(long timeEntryId) {
    timeEntryMap.remove(timeEntryId);
    }
}
