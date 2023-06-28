package misson25;

/* Sub25クラスにProcessクラスを承継 */
public class Sub25 extends Process{
	private String name;
	public Sub25() {
	}
	public Sub25(String name,int hp,int mp,int attack,int speed,int defence) {
		super(hp,mp,attack,speed,defence);
		this.setName(name);
	}
	/* 名前を取得する */
	public String getName() {
		return name;
	}
	/* 名前を設定する */
	public void setName(String name) {
		this.name = name;
	}
}