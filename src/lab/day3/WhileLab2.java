package lab.day3;

public class WhileLab2 {
	public static void main(String[] args) {
//주의!! while문 안에 변수 선언은 자제하는 게 좋음 초기화까지는 필수는 아님
		while (true) {
			int pairNum1 = (int) (Math.random() * 6) + 1;
			int pairNum2 = (int) (Math.random() * 6) + 1;
			if (pairNum1 == pairNum2) {
				System.out.println("게임 끝");
				break;
			}

			else {
				if (pairNum1 < pairNum2)
					System.out.println("pairNum1이 pairNum2보다 작다");
				else
					System.out.println("pairNum1이 pairNum2보다 크다");
			}

		}
	}
}
