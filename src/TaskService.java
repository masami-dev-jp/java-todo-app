import java.util.ArrayList;
import java.util.List;

public class TaskService {

    // タスクIDを自動採番するための変数
    private int nextId = 1;

    // タスク一覧を保持するList
    private List<Task> tasks = new ArrayList<>();

    // タスクを追加するメソッド
    public void addTask(String title) {
        Task task = new Task(title);
        task.setId(nextId);
        tasks.add(task);

        nextId++;
    }

    // 指定したタスクのステータスを更新するメソッド
    public void updateTaskStatus(int id, Task.TaskStatus newStatus) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTaskStatus(newStatus);
                return;
            }
        }
    }

    // 指定したタスクを削除するメソッド
    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    // タスク一覧を表示するメソッド
    public void listTasks() {
        for (Task task : tasks) {
            System.out.println(task.getId());
            System.out.println(task.getTitle());
            System.out.println(task.getTaskStatus());
        }
    }
}
