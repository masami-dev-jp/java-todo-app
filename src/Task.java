public class Task {
    // タスクID
    private int id;

    // タスク名
    private String title;

    // タスク進捗状態
    private TaskStatus taskStatus;


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


    // setter：フィールドへ値を設定するため使用　カプセル化
    // getter：フィールドの値を取得するため使用　カプセル化

    // タスクIDに値をセット(setter)
    public void setId(int id) {
        this.id = id;
    }

    // タスクIDの値を取得(getter)
    public int getId() {
        return id;
    }

    // タスク名に値をセット(setter)
    public void setTitle(String title) {
        this.title = title;
    }

    // タスク名の値を取得(getter)
    public String getTitle() {
        return title;
    }

    // タスク進捗状態に値をセット(setter)
    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    // タスク進捗状態の値を取得(getter)
    public TaskStatus getTaskStatus() {
        return taskStatus;
    }
}
