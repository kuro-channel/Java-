package makeclass.practice;

public abstract class AbstractItem { // 共通クラス
	// p.80 抽象クラス
	// 抽象クラス：継承されることを前提としたクラス。共通的な機能を実装する等、クラスのひな形として利用される。
	// 抽象メソッドは、引数と戻り値を指定し、abstract修飾子を指定することで定義できる

	protected String name;

	public AbstractItem(String name){ // コンストラクタ
		this.name = name;
	}

	public abstract void print(String parentPath); // 抽象メソッド。子クラスで実装する。
}
