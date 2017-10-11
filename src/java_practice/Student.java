package java_practice;

public class Student {
	// p.45 クラスの宣言
	// フィールドを宣言する
	String name;
	int score;
	static final int MAX_SCORE = 100;

	// p.53 コンストラクタ
	public Student(String name) {
		this(name,0);
	}

	// 名前と点数を渡すコンストラクタ
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	void printScore(){
		System.out.println(name + "さんは" + MAX_SCORE + "点満点中" + score + "点です。");
	}
}
