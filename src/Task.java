public class Task {
    int id;
    String title;
    TaskStatus taskStatus;

    enum TaskStatus {
        NOT_STARTED,
        IN_PROGRESS,
        DONE
    }
}
