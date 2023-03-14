package lab.day7;


class Multiplication {

	private int dan;
	private int number;

	Multiplication() {
	}

	Multiplication(int dan) {

		this.dan = dan;

	}

	Multiplication(int dan, int number) {

		this.dan = dan;
		this.number = number;

	}

	void printPart() {

		if (number == 0) { //dan만 설정된 것
			for (int n = 1; n <= 9; n++) {
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			}
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}

}

public class GuGuDanApp {

	public static void main(String[] args) {
	
		
		int dan = (int)(Math.random()*20)+1;
		int number = (int)(Math.random()*20)+1;
		
		System.out.println(dan);
		System.out.println(number);

		if(dan <10) {
			if(number<10) {
				GuGuDanExpr gu = new GuGuDanExpr(dan,number);
				gu.printPart();
			}else {
				GuGuDanExpr gu = new GuGuDanExpr(dan);
				System.out.print(dan + "단 : ");
				gu.printPart();
			}
		}else {
			GuGuDanExpr.printAll();
		}
	}

}
