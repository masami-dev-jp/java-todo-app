
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TaskServiceインスタンス生成しserviceに代入
        TaskService service = new TaskService();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            showMenu();

            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {

                case 0:
                    return;

                case 1:
                    handleListTasks(service, scanner);
                    break;

                case 2:
                    handleAddTask(service, scanner);
                    break;

                case 3:
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
                    break;

                case 4:
                    handleDeleteTask(service, scanner);
                    break;

                default:
                    System.out.println("存在しないメニューです");
            }
        }
    }


    private static void handleListTasks(TaskService service, Scanner scanner) {
        System.out.println("タスク一覧を表示します");
        service.listTasks();
    }

    private static void handleAddTask(TaskService service, Scanner scanner) {
        System.out.println("追加するタスクを入力してください");
        String title = scanner.nextLine();
        service.addTask(title);
        service.listTasks();
    }

    private static void handleDeleteTask(TaskService service, Scanner scanner) {
        System.out.println("削除したいタスクIDを入力してください");
        service.listTasks();
        int deleteId = scanner.nextInt();
        scanner.nextLine();

        service.deleteTask(deleteId);
        service.listTasks();
    }

    private static void showMenu() {
        System.out.println("1. タスク一覧表示");
        System.out.println("2. タスク追加");
        System.out.println("3. タスクステータス更新");
        System.out.println("4. タスク削除");
        System.out.println("0. 終了");
    }
}