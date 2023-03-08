package lab.day3;

import java.util.Iterator;

public class ForLab9 {
	public static void main(String[] args) {
		
		int rand = (int)(Math.random()*2)+1;
		
		for(int dan = 1; dan <= 9; dan++) {
			for(int num=1; num <= 9; num++) {
				if(rand==2 && dan%2 ==0 )
				System.out.print(dan + "x" + num + "=" + dan*num + "\t");
				else if (rand==1 && dan%2==1)
					System.out.print(dan + "x" + num + "=" + dan*num + "\t");
			}
			System.out.println();
		}
		
//		다른 사람 코드
		
//		for(int i= rand; i<=9; i+=2) {
//			for(int j =1; j<= 9;j++) {
//				System.out.print(i+"x"+j+"="+i*j);
//				System.out.print("\t");
//			}
//			System.out.println();
//		}
	}

}
