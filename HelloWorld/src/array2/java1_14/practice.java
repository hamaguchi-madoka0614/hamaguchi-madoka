//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package array2.java1_14;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] strArray = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
		String str = "i";
		for (int k = 0; k <= 3; k++) {
			System.out.println(strArray[k]);
		}
		for (int m = 0; m <= 9; m++) {
			if (strArray[m].equals(str)) {
				continue;
			}
			System.out.println(strArray[m]);
		}
	}
}
