package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.domian.TimeEntry;
import io.pivotal.pal.tracker.repository.TimeEntryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeEntryController {
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {

    }

    public ResponseEntity create(TimeEntry timeEntryToCreate) {
            return null;
    }

    public ResponseEntity<TimeEntry> read(long timeEntryId) {
        return null;
    }

    public ResponseEntity<List<TimeEntry>> list() {
            return null;
    }

    public ResponseEntity update(long nonExistentTimeEntryId, TimeEntry timeEntry) {
        return null;
    }

    public ResponseEntity delete(long timeEntryId) {
        return null;
    }
}