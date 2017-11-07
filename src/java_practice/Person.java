package java_practice;

public class Person {
	private String name;

	// p.56 メソッドのオーバーライドを示す
	@Override
	public String toString(){
		return name;
	}

	// p.056 非推奨
	@Deprecated
	public String get_name(){
		return name;
	}

	public String getName(){
		return name;
	}

}
