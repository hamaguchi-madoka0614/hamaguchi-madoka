package basicClass19;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog(); // Dog　classを呼び出してる
		System.out.println(dog.name); // dog classの名前を出力

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog d = new Dog();
		System.out.println(d.num); // dog class動物の数を出力


		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

}

