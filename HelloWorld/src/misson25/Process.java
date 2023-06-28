package misson25;

public class Process {
	private int hp; // hpを宣言
	private int mp; // mpを宣言
	private int attack; // 攻撃力を宣言
	private int speed; // 素早さを宣言
	private int defense; // 防御力を宣言
	
public Process() {
}

public Process(int hp,int mp,int attack,int speed,int defence) {
	this.setHp(hp);
	this.setMp(mp);
	this.setAttack(attack);
	this.setSpeed(speed);
	this.setDefense(defence);
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
}
