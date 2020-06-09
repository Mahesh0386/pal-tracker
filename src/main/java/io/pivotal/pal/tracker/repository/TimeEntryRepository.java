package io.pivotal.pal.tracker.repository;

import io.pivotal.pal.tracker.domian.TimeEntry;

import java.util.List;

public interface TimeEntryRepository {

    public TimeEntry find(long timeEntryId) ;

    public TimeEntry create(TimeEntry any);

    public List<TimeEntry> list();

    public TimeEntry update(long eq, TimeEntry any);

    public void delete(long timeEntryId);
}
