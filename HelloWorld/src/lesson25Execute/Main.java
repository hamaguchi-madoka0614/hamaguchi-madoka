package lesson25Execute;
import misson25.sub25;
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
		sub25 sub = new sub25();
		/* キャラクターの能力を表示 */
		System.out.println("こんにちは「" + sub.getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + sub.getHp());
		System.out.println("MP：" + sub.getMp());
		System.out.println("攻撃力：" + sub.getAttack());
		System.out.println("素早さ：" + sub.getSpeed());
		System.out.println("防御力：" + sub.getDefense());
	}
}

