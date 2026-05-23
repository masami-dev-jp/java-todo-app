//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TaskService service = new TaskService();
        service.addTask("Todoアプリ作成");
        service.addTask("筋トレ");

        service.updateTaskStatus(1, Task.TaskStatus.DONE);
        service.listTasks();

    }
}