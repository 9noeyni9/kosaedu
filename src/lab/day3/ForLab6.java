package lab.day3;

public class ForLab6 {
	
	public static void main(String[] args) {
		final char DECO = '$';
		
		int rand = (int)(Math.random()*6)+5;
		
		for (int n = 1; n <= rand; n++) {
			for (int m = 0; m < n; m++) {
				System.out.print(DECO);
			}
			System.out.println();
		}
	}

}
