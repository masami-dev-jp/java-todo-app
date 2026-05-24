//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // TaskServiceインスタンス生成しserviceに代入
        TaskService service = new TaskService();

        // serviceにタスク追加
        service.addTask("Todoアプリ作成");
        service.addTask("筋トレ");

        // タスクステータス更新
        service.updateTaskStatus(1, Task.TaskStatus.DONE);

        // タスク削除
        service.deleteTask(1);

        // タスク一覧表示
        service.listTasks();

    }
}