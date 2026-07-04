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


    public void handleAddTask(){
        System.out.println("追加するタスクを入力してください");
        String title = scanner.nextLine();

        try {
            service.addTask(title);
            service.listTasks();
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    public void handleUpdateTaskStatus() {

        Task.TaskStatus newStatus = null;

        System.out.println("更新するタスクIDを入力してください");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("更新後のステータスを選択してください");
        System.out.println("1. NOT_STARTED");
        System.out.println("2. IN_PROGRESS");
        System.out.println("3. DONE");

        int statusMenu = scanner.nextInt();
        scanner.nextLine();

        switch (statusMenu) {
            case 1:
                newStatus = Task.TaskStatus.NOT_STARTED;
                break;

            case 2:
                newStatus = Task.TaskStatus.IN_PROGRESS;
                break;

            case 3:
                newStatus = Task.TaskStatus.DONE;
                break;

            default:
                throw new IllegalArgumentException("不正な入力です");
        }
        service.updateTaskStatus(id, newStatus);
    }



    public void handleDeleteTask(){
        System.out.println("削除したいタスクIDを入力してください");
        service.listTasks();
        int deleteId = scanner.nextInt();
        scanner.nextLine();

        try {
            service.deleteTask(deleteId);
            service.listTasks();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}
