import java.time.LocalDateTime;

public class Task {
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Priority priority;

    public Task(String description, LocalDateTime startTime, LocalDateTime endTime, Priority priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
    }

    // Getters and setters for description, startTime, endTime, and priority

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", priority=" + priority +
                '}';
    }
}
