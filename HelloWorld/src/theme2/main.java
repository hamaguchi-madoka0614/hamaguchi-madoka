/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。

 */
package theme2;

import java.text.SimpleDateFormat;
import java.util.Date;

import process.Profile;

public class main {

	public static void main(String[] args) {

		// 呼び出し
		Profile p = new Profile();
		// Profile classの国名を出力
		System.out.println("こんにちは！ここは"+p.land+"です！");

		// 呼び出し
		Profile pr = new Profile();
		pr.food = "寿司";

		// Profile classのfoodを出力
		System.out.println("この"+pr.food+"はうまい");
		System.out.println(pr.food+"は和食です");

		// 現在の日時を「yyyy/MM/dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("今の現在日時は"+df.format(date)+"です");
	}

}


