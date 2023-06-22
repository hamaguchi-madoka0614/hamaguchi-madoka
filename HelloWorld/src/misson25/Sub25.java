package misson25;
import java.util.Scanner;

/* Sub25クラスにProcessクラスを承継 */
public class Sub25 extends Process{
	public Sub25() {
		super.setName(name);
	}
	Scanner scanner = new Scanner(System.in);
	String name = scanner.nextLine();
	
}