package lab.day7;

public class GuGuDanExpr extends Multiplication {

	GuGuDanExpr() {

	}

	GuGuDanExpr(int dan) {
		super(dan);
	}

	GuGuDanExpr(int dan, int number) {
		super(dan, number);
	}

	public static void printAll() {

		for(int dan = 1; dan <= 9; dan++) {
			for(int number=1; number <= 9; number++)
				System.out.print(dan + "x" + number + "=" + dan*number + "\t");		
			System.out.println();
		}	

	}
}
