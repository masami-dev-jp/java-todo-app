
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TaskServiceインスタンス生成しserviceに代入
        TaskService service = new TaskService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. 一覧表示");
        System.out.println("2. タスク追加");
        System.out.println("3. タスクステータス更新");
        System.out.println("4. タスク削除");

        int menu = scanner.nextInt();
        scanner.nextLine();

        Task.TaskStatus newStatus = null;

        switch (menu) {
            case 1:
                System.out.println("タスク一覧を表示します");
                service.listTasks();
                break;

            case 2:
                System.out.println("追加するタスクを入力してください");
                String title = scanner.nextLine();
                service.addTask(title);
                service.listTasks();
                break;

            case 3:
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
                        throw new IllegalAccessException("不正な入力です");

                }
                service.updateTaskStatus(id,newStatus);
                break;

            case 4:
                System.out.println("タスク削除");
                break;

            default:
                System.out.println("存在しないメニューです");
        }





        // serviceにタスク追加
/*        service.addTask("Todoアプリ作成");
        service.addTask("筋トレ");

        // タスクステータス更新
        service.updateTaskStatus(1, Task.TaskStatus.DONE);

        // タスク削除
        service.deleteTask(1);

        // タスク一覧表示
        service.listTasks();*/

    }
}