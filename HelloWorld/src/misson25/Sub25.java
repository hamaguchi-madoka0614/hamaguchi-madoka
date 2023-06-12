package misson25;

import java.util.Random;

/* prosessクラスsub25クラスに継承させる */
public class sub25 extends process{
	public int Random() {
		/* 乱数を生成する */
		Random ran = new Random();
		int num = ran.nextInt(1000);
		return num;
	}
	public sub25() {
		super.setName(getName());
		super.setHp(Random());
		super.setMp(Random());
		super.setAttack(Random());
		super.setSpeed(Random());
		super.setDefense(Random());
	}
}

