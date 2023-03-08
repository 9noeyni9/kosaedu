package lab.day3;

public class WhileLab1 {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 6) + 5;

		System.out.println("[for 결과]");
		for (int m = 1; m <= n; m++) {
			System.out.println(m + "->" + m * m);
		}

		System.out.println("[while 결과]");

		int m2=1;// 초기식 와일문 전에
		while (m2<=n) {
			System.out.println(m2 +"->"+ m2*m2);
			m2++;//증감식 while문 안에
		}
			
			
	}

}
