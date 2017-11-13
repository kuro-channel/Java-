package java_practice;

public class StaticTestMain {

	public static void main(String[] args) {
		// p.77 static修飾子
		System.out.println(StaticTest.staticField); //World インスタンス化不要
		System.out.println(StaticTest.staticMethod()); // yay!

		StaticTest.staticField = "Japan";
		System.out.println(StaticTest.staticField); // Japan 書き換わるよ！グローバル変数みたいに使える

		StaticTest test = new StaticTest();
		System.out.println(test.staticField); // Japan
		System.out.println(test.staticMethod()); // yay!
		System.out.println(test.instanceMethod()); // Hello Japan yay!

	}

}
