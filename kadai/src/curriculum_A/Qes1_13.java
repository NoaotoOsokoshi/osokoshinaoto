package curriculum_A;

public class Qes1_13 {

	private static final char a = 0;

	public static void main(String[] args) { 
		
		/*	1				
			下記9個をローカル変数として宣言のみしてください			
			・バイト型・短整数型・整数型・長整数型			
			・単精度浮動小数点数型・倍精度浮動小数点数型			
			・文字型・文字列型			
			・ブーリアン型			
		*/
		byte by;
		short sh;
		int in;
		long lo;
		float fl;
		double dou;
		char ch;
		String str;
		boolean bo;

		/*
		 * 2
		 * それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください		
		 */
		by = 0;
		sh = 0;
		in = 0;
		lo = 0L;
		fl = 0.0f;
		dou = 0.0d;
		ch = '\u0000';
		str = null;
		bo = false;

		/*
		 * 3
		 * 初期化をしたそれぞれの変数に下記の値を代入してください
		 * ・バイト型		10
		 * ・短整数型		100
		 * ・整数型		1000
		 * ・長整数型		10000
		 * ・単精度浮動小数点数型		9.5
		 * ・倍精度浮動小数点数型		10.5	
		 * ・文字型		a	
		 * ・文字列型		ハロー	
		 * ・ブーリアン型		true	
		 */
		by = 10;
		sh = 100;
		in = 1000;
		lo = 10000L;
		fl = 9.5f;
		dou = 10.5d;
		ch = 'a';
		str = "ハロー";
		bo = true;

		/*
		 * 4
		 * 下記の通りにコンソール出力されるようにしてください
		 * 上記で作成した変数を必ず使用すること	
		 * 11110		        11110
		 * 20		            20	
		 * a ハロー true		a ハロー true	
		 * 11130		        11130	        数字を全て足す
		 * 10000000000		    10000000000	    小数点以外の数字を全てかける
		 * 0.105		        0.105	        10.5割る100をする
		 * -90		            -90 	        10引く100をする
		 */
		System.out.println(by + sh + in + lo);
		System.out.println((int)(fl + dou));
		System.out.println(ch + " " + str + " " + bo);
		System.out.println(by * sh * in * lo);
		System.out.println(dou / sh);
		System.out.println(by - sh +"\n");

		/*
		 * 5
		 * 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		 * 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。String num="20";
		 * int num1=23;	
		 * System.out.println("ハローJAVA"+(num+num1));			
		 */
		// numをString型からint型に変更
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1) + "/n");

		/*
		 * 6
		 * 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください	
		 * ローカル変数に代入し○○に入れてください	
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 * 	↓↓format↓↓
		 * 「初めまして○○です」
		 * 「年齢は○○歳です」
		 * 「身長は○○cmです」
		 * 「体重は○○kgです」
		 * 「好きな食べ物は○○です」			
		 */
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("身長は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");

		/*
		 * 7
		 * 6で作成した自己紹介に続いてBMIが出力されるようにしてください	
		 * 「BMIは○○です」
		 * ただし計算は数値を直書きせず、全て変数を使ってすること　
		 */
		System.out.println("BMIは" + String.format("%.1f", weight / (height / 100) / (height / 100)) + "です\n");
		
		/*
		 * 8
		 * 6で宣言した変数に再代入し下記の通りコンソールに出力してください	
		 * 初めまして鈴木一郎です
		 * 年齢は24歳です
		 * 身長168.5cmです
		 * 体重は64.2kgです	
		 * 好きな食べ物はオムライスです	
		 * BMIは22.6です					
		 */
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("身長は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", weight / (height / 100) / (height / 100)) + "です\n");

		/*
		 * 9
		 * 8 で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください	
		 * 初めまして鈴木一郎です
		 * 年齢は48歳です
		 * 身長337.0cmです	
		 * 体重は128.4kgです
		 * 好きな食べ物はオムライスです	
		 * BMIは11.31です			
		 */
		age += age;
		height += height;
		weight += weight;
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("身長は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + String.format("%.1f", weight / (height / 100) / (height / 100)) + "です\n");

		/*
		 * 10
		 * 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません			
		*/
		age = 24;
		height = 168.5;
		weight = 64.2;
		bo = (age >= 25);
		System.out.println(bo+"\n");

		/*
		 * 11
		 * 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください			
		*/
		String strAge = String.valueOf(age);
		String strHeight = String.valueOf(height);
		String strWeight = String.valueOf(weight);
		System.out.println(strAge + strHeight + strWeight + "\n");

		/*
		 * 12
		 * 11で変換した【年齢・身長】を整数型に変換して出力してください			
		*/
		int intAge = Integer.valueOf(strAge);
		System.out.println(intAge);
		double douHeight = Double.parseDouble(strHeight);
		int intHeight = (int)douHeight;
		System.out.println(intHeight + "\n");

		/*
		 * 13
		 * 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		 * ただしif文は使わないでください			
		 */

		bo = (intAge == 25 || intHeight >= 160);
		System.out.println(bo);
	}

}
