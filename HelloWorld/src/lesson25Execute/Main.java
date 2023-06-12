package lesson25Execute;
import misson25.Sub25;
/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/
public class Main{
	public static void main(String[] args) {
		/* sub25クラスを呼び出す */
		Sub25 sub = new Sub25();
		
		/* 値を代入 */
		sub.setHp((int)(Math.random() * 1000) + 1);
		sub.setMp((int)(Math.random() * 1000) + 1);
		sub.setAttack((int)(Math.random() * 1000) + 1);
		sub.setSpeed((int)(Math.random() * 1000) + 1);
		sub.setDefense((int)(Math.random() * 1000) + 1);
		
		/* キャラクターの能力を表示 */
		System.out.println("こんにちは「" + sub.name + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + sub.getHp());
		System.out.println("MP：" + sub.getMp());
		System.out.println("攻撃力：" + sub.getAttack());
		System.out.println("素早さ：" + sub.getSpeed());
		System.out.println("防御力：" + sub.getDefense());
		System.out.println("さあ冒険に出かけよう！");
		
	}
}

