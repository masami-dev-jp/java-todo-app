//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Todoアプリ作成");

        task1.setId(1);
        task1.setTaskStatus(Task.TaskStatus.IN_PROGRESS);

        System.out.println(task1.getId());
        System.out.println(task1.getTitle());
        System.out.println(task1.getTaskStatus());

        Task task2 = new Task("筋トレ");

        task2.setId(2);
        task2.setTaskStatus(Task.TaskStatus.IN_PROGRESS);

        System.out.println(task2.getId());
        System.out.println(task2.getTitle());
        System.out.println(task2.getTaskStatus());

    }

}