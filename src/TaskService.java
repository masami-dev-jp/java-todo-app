import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private int nextId = 1;

    List<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        Task task = new Task(title);
        task.setId(nextId);
        tasks.add(task);

        nextId++;
    }
}
