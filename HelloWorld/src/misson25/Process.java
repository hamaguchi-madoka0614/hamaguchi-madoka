package misson25;

public class Process {
	private String name;
	private int hp; // hpを宣言
	private int mp; // mpを宣言
	private int attack; // 攻撃力を宣言
	private int speed; // 素早さを宣言
	private int defense; // 防御力を宣言
public Process() {
	
}
	/* hpを取得する */
	public int getHp() {
		return hp;
	}
	/* hpを設定する */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/* mpを取得する */
	public int getMp() {
		return mp;
	}
	/* mpを設定する */
	public void setMp(int mp) {
		this.mp = mp;
	}
	/* 攻撃力を取得する */
	public int getAttack() {
		return attack;
	}
	/* 攻撃力を設定する */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	/* 素早さを取得する */
	public int getSpeed() {
		return speed;
	}
	/* 素早さを設定する */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/* 防御力を取得する */
	public int getDefense() {
		return defense;
	}
	/* 防御力を設定する */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
