package java_practice;

public enum HttpStatus {
	// p.99 enum（列挙型）
	// 任意の値を関連づけて保持することができる（この場合、名称と3桁の数値を関連付けて持つことが可能）
	OK(200),NOT_FOUND(404), INTERNAL_SERVER_EROOR(500);

	private final int value;

	// enumのコンストラクタはprivate
	private HttpStatus(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}
}
