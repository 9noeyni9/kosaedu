package lab.day3;

public class ForLab7 {
	public static void main(String[] args) {
		final char STAR = '*';
		
		for(int i=7;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(STAR);
			}
			System.out.println();
		}
	}

}
