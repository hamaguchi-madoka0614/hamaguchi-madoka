package method18;

import java.util.Random;

public class Method {

	public static void main(String[] args) {
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
		hello();
		number(5);
		number1(5,6);
		number1(5.0,6.0);
		nextInt(3);
		ave(nextInt(3));
	};
		public static String hello() {
			System.out.println("Hello Java");
			return "Hello Java";
		}
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
		public static void number(int num) {
			System.out.println(num+1);
		}
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		public static int number1(int num,int num1) {
			System.out.println(num*num1);
			return num*num1;
		}
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
		public static double number1(double num,double num1) {
			System.out.println(num*num1);
			return num*num1;
		}
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
		public static int[] nextInt(int num) {
		    int[]a=new int[num];//配列の小部屋の数。
		    Random rand = new Random();//ランダム関数の準備。
		    for(int i=0;i<num;i++) {//numの数字分繰り返す
		    	a[i]=rand.nextInt(99)+1;//aの配列のそれぞれの小部屋に1～100までのランダムな数字を格納している。
		    	 System.out.println(a[i]);//上に格納したものを出力
		    }
		    return a;
		}
		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		public static double ave(int[] a) {
			int c=0;
			for(int i=0;i<a.length;i++) {
				 c +=a[i];
			}
			System.out.println((double)c/a.length);
			return (double)c/a.length;
		}
		
}
		
		
		// ※小数点以下も表示されるようにしてください。
	

