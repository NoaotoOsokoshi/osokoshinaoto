package lesson19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name;
	// Q2：フィールドに動物の数の変数を定義してください。
	int num;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public void DogName() {
		name = "犬";
		System.out.println(name);
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public void DogNum(int num) {
		System.out.println(num);
	}
	
}
