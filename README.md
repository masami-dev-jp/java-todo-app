# Java TODOタスク管理アプリ

## 概要
Javaのオブジェクト指向やクラス設計の学習を目的として作成した、コンソールベースのTODOタスク管理アプリです。

## 使用技術
- Java 17
- Git
- GitHub
- IntelliJ IDEA

## 機能
- 登録
- 更新 (タイトル変更、ステータス更新)
- 削除
- 一覧 (全件表示、完了表示、着手中表示、未完了表示)
- 検索 (ID,タイトル検索)

## 管理する項目
- ID
- タイトル
- ステータス (完了/着手中/未完了)　Enumを使用

## クラス構成
- Main.java
- Task.java
- TaskController.java
- TaskService.java

## 各クラスの役割
- Main.java（アプリケーションの起動と各クラスの生成を行うクラス）
- TaskController.java（入力受付と画面表示、TaskServiceの呼び出しを行うクラス）
- Task.java（タスク情報を保持するクラス）
- TaskService.java（登録・更新・削除・一覧・検索などのビジネスロジックを担当するクラス）

## その他ルール
- IDの採番は一度削除されたものは再利用しない

## 学んだこと
- Javaの基本文法を用いたアプリケーション開発
- クラス設計とオブジェクト指向の基礎
- ControllerとServiceへの責務分離
- コンストラクタを利用した依存関係の受け渡し
- 例外処理（try-catch、throw）の実装
- 入力値のバリデーション
- ListやEnumを用いたデータ管理
- ラムダ式（removeIf）の利用