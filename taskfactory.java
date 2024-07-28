public interface TaskFactory {
    Task createTask(String description, LocalDateTime startTime, LocalDateTime endTime, Priority priority);
}

public class SimpleTaskFactory implements TaskFactory {
    @Override
    public Task createTask(String description, LocalDateTime startTime, LocalDateTime endTime, Priority priority) {
        return new Task(description, startTime, endTime, priority);
    }
}
