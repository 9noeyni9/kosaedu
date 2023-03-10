package lab.day5;

public class MethodLab5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int res1 = getRandom(10);
			if (i < 5)
				System.out.print(res1 + ", ");
			else
				System.out.println(res1);
		}
		for (int i = 1; i <= 5; i++) {
			int res2 = getRandom(10,20);
			if (i < 5)
				System.out.print(res2 + ", ");
			else
				System.out.println(res2);
		}

	}

	// 오버로딩
	public static int getRandom(int n) {
		return (int) (Math.random() * n) + 1;
	}

	public static int getRandom(int n1, int n2) {
		return (int) (Math.random() * (n2-n1+1)) + n1;
	}

}
