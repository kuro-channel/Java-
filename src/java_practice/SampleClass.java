package java_practice;

public class SampleClass {
	// p.73 クラスの生成
	private String name = "Sample";
	// protectedは同一パッケージ内、もしくは子クラスから参照可能
	protected String test = "";

	public String action(){
		return name + ">" + "Action";
	}
}
