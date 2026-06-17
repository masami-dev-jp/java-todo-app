import java.util.Scanner;

public class TaskController {

    private TaskService service;
    private Scanner scanner;

    public TaskController(TaskService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

}
