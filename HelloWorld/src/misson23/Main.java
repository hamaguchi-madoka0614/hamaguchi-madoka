package misson23;
/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
体長：2.1m
速度：80km/h
	
*/
public class Main {
	private String animal; // 動物名
	private double height; // 体長
	private int speed;// 速度 

	/* 動物名を取得 */
	public String getAnimal() {
		return animal;
	}

	/* 動物名の設定 */
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	/* 体長を取得 */
	public double getHeight() {
		return height;
	}
	
	/* 体長の設定 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/* 速度の取得 */
	public int getSpeed() {
		return speed;
	}
	
	/* 速度の設定 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/* 動物情報の表示　*/
	public void showMain() {
		System.out.println("動物名：" + animal);
		System.out.println("体長：" + height +"m");
		System.out.println("速度：" + speed + "km/h");
	}
}
