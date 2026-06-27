import java.util.Scanner;

public class TaskController {

    private TaskService service;
    private Scanner scanner;

    public TaskController(TaskService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    public void handleListTasks() {
        System.out.println("タスク一覧を表示します");
        service.listTasks();
    }


}
