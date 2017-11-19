package makeclass.practice;

public class Main {

	public static void main(String[] args) {
		// ファイルアイテム
		FileItem fileItem = new FileItem("test.txt");
		fileItem.print("/test/test");

		// ディレクトリアイテム
//		List<AbstractItem> item;
//		DirectoryItem directoryItem = new DirectoryItem("test.txt", );

		// p.84 匿名クラス
		// Fooインターフェースを実装する匿名クラスを定義し、インスタンス化する
		Foo foo = new Foo() {

			@Override
			public String say() {
				// TODO 自動生成されたメソッド・スタブ
				return null;
			}
		};
		foo.say();
	}

}
