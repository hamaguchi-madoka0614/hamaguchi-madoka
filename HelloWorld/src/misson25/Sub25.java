package misson25;
import java.util.Scanner;

/* prosessクラスsub25クラスに継承させる */
public class Sub25 extends Process{
	/* 文字列の入力を受ける */
	Scanner scanner = new Scanner(System.in);
	public String name = scanner.nextLine();
}
