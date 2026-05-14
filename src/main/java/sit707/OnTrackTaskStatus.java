package sit707;

public class OnTrackTaskStatus {

    public String checkStatus(String studentId, String taskId) {

        if (studentId == null || studentId.trim().isEmpty()) {
            return "Invalid Student ID";
        }

        if (taskId == null || taskId.trim().isEmpty()) {
            return "Invalid Task ID";
        }

        if (studentId.equals("224726304") && taskId.equals("7.1P")) {
        	return "Submitted";
        }

        if (studentId.equals("224726304") && taskId.equals("8.1P")) {
            return "Awaiting Feedback";
        }

        if (studentId.equals("224726304") && taskId.equals("9.1P")) {
            return "Not Submitted";
        }

        return "Task Not Found";
    }
}