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

    public void updateTaskStatus(int id, Task.TaskStatus newStatus) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTaskStatus(newStatus);
                return;
            }
        }
    }


    public void listTasks() {
        for (Task task : tasks) {
            System.out.println(task.getId());
            System.out.println(task.getTitle());
            System.out.println(task.getTaskStatus());
        }
    }
}
