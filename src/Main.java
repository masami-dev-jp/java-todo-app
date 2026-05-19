//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Taskインスタンス生成（タスク作成）
        Task task1 = new Task("Todoアプリ作成");

        // setterを使用してTaskから作ったオブジェクトtask1にIDと進捗状態を設定
        task1.setId(1);
        task1.setTaskStatus(Task.TaskStatus.IN_PROGRESS);

        // getterを使用してtask1のid,title,taskStatusの情報を表示
        System.out.println(task1.getId());
        System.out.println(task1.getTitle());
        System.out.println(task1.getTaskStatus());

        // 2つ目のTaskインスタンス生成
        Task task2 = new Task("筋トレ");

        // setterを使用してTaskから作ったオブジェクトtask2にIDと進捗状態を設定
        task2.setId(2);
        task2.setTaskStatus(Task.TaskStatus.IN_PROGRESS);

        // getterを使用してtask2のid,title,taskStatusの情報を表示
        System.out.println(task2.getId());
        System.out.println(task2.getTitle());
        System.out.println(task2.getTaskStatus());


        // Taskを複数管理するためのList(tasks)を作成
        List<Task> tasks = new ArrayList<>();

        // List(tasks)にtask1,task2を追加
        tasks.add(task1);
        tasks.add(task2);

        // List(tasks)の0番目のid,title,taskStatusを取得して表示
        System.out.println(tasks.get(0).getId());
        System.out.println(tasks.get(0).getTitle());
        System.out.println(tasks.get(0).getTaskStatus());

        // List(tasks)の1番目のid,title,taskStatusを取得して表示
        System.out.println(tasks.get(1).getId());
        System.out.println(tasks.get(1).getTitle());
        System.out.println(tasks.get(1).getTaskStatus());


        for (Task task : tasks) {
            System.out.println(task.getId());
            System.out.println(task.getTitle());
            System.out.println(task.getTaskStatus());
        }
    }
}