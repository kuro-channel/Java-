package makeclass.practice;

public class DefaultFoo implements Foo{
	// interface:fooを実装
	private String message;

	// 定数も定義できる!
	public static final int TASK_TYPE_PRIVATE = 0;
	public static final int TASK_TYPE_WORK = 1;

	public DefaultFoo(String message) {
		this.message = message;
	}

	@Override
	public String say() {
		// TODO 自動生成されたメソッド・スタブ
		return message;
	}

}
