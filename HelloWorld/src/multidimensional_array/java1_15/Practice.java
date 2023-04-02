/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package multidimensional_array.java1_15;

public class Practice {

	public static void main(String[] args) {
		String test[][] = {
				{ "生徒1:国語64点、数学73点、英語69点" },
				{ "生徒2:国語58点、数学81点、英語75点" },
				{ "生徒3:国語86点、数学68点、英語79点" },
				{ "生徒4:国語72点、数学55点、英語80点" }
		};
		for (int n = 0; n <= 3; n++) {
			System.out.println(test[n][0]);
		}
		int num[][] = {
				{ 64,73,69 },
				{ 58,81,75 },
				{ 86,68,79 },
				{ 72,55,80 }
		};
			int jaSum=num[0][0]+num[1][0]+num[2][0]+num[3][0];
			int jaAvs=jaSum/num.length;
				System.out.println("国語の平均点は"+jaAvs+"点です。");
			
			int maSum=num[0][1]+num[1][1]+num[2][1]+num[3][1];
			int maAvs=maSum/num.length;
				System.out.println("数学の平均点は"+maAvs+"点です。");
				
			int enSum=num[0][2]+num[1][2]+num[2][2]+num[3][2];
			int enAvs=enSum/num.length;
				System.out.println("英語の平均点は"+enAvs+"点です。");
		
		
		
	}
};
