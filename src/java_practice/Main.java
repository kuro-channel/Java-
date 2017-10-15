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

		// p.064 リテラル：ソースコードに直接記述された値のこと
		// p.69 ~ ラッパークラスを利用する

		// int → Integer
		Integer nums1 = Integer.valueOf(10);
		int nums2 = nums1.intValue();
		System.out.println(nums2);

		// String → Integer
		Integer nums3 = Integer.valueOf("11");
		int nums4 = nums3.intValue();
		System.out.println(nums4);

		// String → int
		int nums5 = Integer.parseInt("12");
		System.out.println(nums5);

		// String → int
		String nums9 = Integer.toString(13);
		System.out.println(nums9);

	}
	// p.049 メソッドのオーバーロード メソッドの宣言
	void printScore(int maxScore){
		String name = "";
		int maxscore = 0;
		int score = 0;
		System.out.println(name + "さんは" + maxscore + "点満点中" + score + "点です");
	}
	void printScore(){
		final int MAX_SCORE = 0;
		printScore(MAX_SCORE);
	}



}
