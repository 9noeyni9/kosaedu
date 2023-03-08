package lab.day3;

public class ForLab5 {
	public static void main(String[] args) {
		int rand1 = (int)(Math.random()*8)+3;
		int rand2 = (int)(Math.random()*3)+1;
		
		System.out.println(rand1);
		System.out.println(rand2);
		for(int n=0;n<rand1;n++) {
			if(rand2==1) {
				System.out.print('*');
			}
			else if(rand2==2) {
				System.out.print('$');
			}
			else
				System.out.print("#");
		}
//		다른 사람 코드
		
//		int num1 = (int)(Math.random()*8)+3;
//		int num2 = (int)(Math.random()*3)+1;
//		
//		char C;
//		if(num2 == 1)C='*';
//		else if(num2 == 2)C='$';
//		else C = '#';
//		
//		for(int i = 1 ; i < num1; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(C);
//			}
//			System.out.println();
//		}

	}

}
