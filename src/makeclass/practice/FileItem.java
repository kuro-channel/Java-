package makeclass.practice;

import java.io.File;

public class FileItem extends AbstractItem{ // ファイルクラス。ファイルは自分自身のファイル名を表示。

	public FileItem(String name) {
		super(name);
	}
	// Overrideの強制 オーバーライドしないと、エラーメッセージが出力される！
	@Override
	public void print(String parentPath) {
		System.out.println(parentPath + File.separator + name);
	}

}
