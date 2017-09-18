package java_practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// メッセージの表示
		System.out.println("Hello Java World!");
		/* 複数コメント記載
		 * 行を跨いで書くことが出来ます
		 */

		// p.38 if
		int second = LocalDateTime.now().getSecond();
		if(second % 2 ==0){
			System.out.println(second + "は偶数です");
		}else{
			System.out.println(second + "は奇数です");
		}
		// p.39 if ~ / if else ~
		int month = LocalDate.now().getMonthValue();

		if(3<= month && month <=5){
			System.out.println(month+ "月は春です");
		}else if(6<= month && month <=8){
			System.out.println(month+ "月は夏です");
		}else if(9<= month && month <=11){
			System.out.println(month+ "月は秋です");
		}else{
			System.out.println(month+ "月は冬です");
		}

		// p.40 switch
		Month month2 = LocalDateTime.now().getMonth();

		switch (month2) {
		case JANUARY:
			break;
		default:
			break;
		}
		// プリミティブ型と参照型
		// 桁数
		long amount = 123_456_789L;
		System.out.println(amount);

		// P.42~44
		Scanner in = new Scanner(System.in);
		System.out.println("パスワードを入力してください。");
		String str = in.nextLine();

		while(!str.equals("abc")){
			System.out.println("パスワードが違います。正しいパスワードを入力してください。");
			str = in.nextLine();
		}
		System.out.println("OK");
	}

}
