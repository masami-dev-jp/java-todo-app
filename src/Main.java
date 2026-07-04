
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TaskServiceインスタンス生成しserviceに代入
        TaskService service = new TaskService();
        Scanner scanner = new Scanner(System.in);
        TaskController controller = new TaskController(service, scanner);


        while (true) {

            showMenu();

            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {

                case 0:
                    return;

                case 1:
                    controller.handleListTasks();
                    break;

                case 2:
                     controller.handleAddTask();
                    break;

                case 3:
                   controller.handleUpdateTaskStatus();
                    break;


                case 4:
                    controller.handleDeleteTask();
                    break;

                default:
                    System.out.println("存在しないメニューです");
            }
        }
    }



    private static void showMenu() {
        System.out.println("1. タスク一覧表示");
        System.out.println("2. タスク追加");
        System.out.println("3. タスクステータス更新");
        System.out.println("4. タスク削除");
        System.out.println("0. 終了");
    }








}