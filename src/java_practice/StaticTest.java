package java_practice;

public class StaticTest {
	// p.77 クラスで共通のフィールドを定義したり、インスタンスを生成しなくとも呼び出せる static修飾子
	// クラスのフィールドやメソッドにstatic修飾子をつけることで、クラスメンバに指定できる
	static String staticField = "World!"; // クラスフィールド
	static String staticMethod(){ // クラスメソッド
		return "yay!";
	}

	// p.78 final修飾子
	static final String GREETING_MESSAGE = "Hello"; // final: 変数を変更不可

	String instanceField = "Hello!"; // インスタンスフィールド
	String instanceMethod(){ // インスタンスメソッド
		return instanceField + " " + staticField + " " + staticMethod();
	}
}
