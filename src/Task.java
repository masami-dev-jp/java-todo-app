public class Task {
    int id;
    String title;
    TaskStatus taskStatus;

    // enum：ステータスで取得する値を限定するためこの3つのみを許可
    enum TaskStatus {
        NOT_STARTED,
        IN_PROGRESS,
        DONE
    }

    // コンストラクタ：Taskインスタンス生成時の初期化処理（titleは引数で受け取り、taskStatusは未着手で固定）
    public Task(String title) {
        this.title = title;
        this.taskStatus = TaskStatus.NOT_STARTED;
    }

}
