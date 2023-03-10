package lab.day5;

public class MethodLab3 {
	public static void main(String[] args) {
		isEven(10);
		isEven(13);
	}

	static boolean isEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + "은 짝수 입니다.");
			return true;
		}else {
			System.out.println(num + "은 홀수 입니다.");
			return false;
		}
	}

}
