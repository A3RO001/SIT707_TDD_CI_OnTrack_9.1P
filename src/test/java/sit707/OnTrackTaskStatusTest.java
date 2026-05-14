package sit707;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OnTrackTaskStatusTest {

    @Test
    public void testSubmittedTaskStatus() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();
        String result = statusChecker.checkStatus("224726304", "7.1P");
        assertEquals("Submitted", result);
    }

    @Test
    public void testAwaitingFeedbackTaskStatus() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();
        String result = statusChecker.checkStatus("224726304", "8.1P");
        assertEquals("Awaiting Feedback", result);
    }

    @Test
    public void testNotSubmittedTaskStatus() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();
        String result = statusChecker.checkStatus("224726304", "9.1P");
        assertEquals("Not Submitted", result);
    }

    @Test
    public void testMissingStudentId() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();
        String result = statusChecker.checkStatus("", "7.1P");
        assertEquals("Invalid Student ID", result);
    }

    @Test
    public void testMissingTaskId() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();
        String result = statusChecker.checkStatus("224726304", "");
        assertEquals("Invalid Task ID", result);
    }

    @Test
    public void testUnknownTaskId() {
        OnTrackTaskStatus statusChecker = new OnTrackTaskStatus();
        String result = statusChecker.checkStatus("224726304", "99.9X");
        assertEquals("Task Not Found", result);
    }
}