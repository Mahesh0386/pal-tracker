package io.pivotal.pal.tracker;

import io.pivotal.pal.tracker.domian.TimeEntry;
import io.pivotal.pal.tracker.repository.TimeEntryRepository;

import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    @Override
    public TimeEntry find(long timeEntryId) {

        return null;
    }

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        return timeEntry;
    }

    @Override
    public List<TimeEntry> list() {
        return null;
    }

    @Override
    public TimeEntry update(long eq, TimeEntry any) {

        return any;
    }

    @Override
    public void delete(long timeEntryId) {

    }
}
