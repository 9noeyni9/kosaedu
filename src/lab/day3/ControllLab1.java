package lab.day3;

public class ControllLab1 {
	public static void main(String[] args) {

		while (true) {
			int rand = (int) (Math.random() * 11) + 10;
			if (rand % 3 == 0 || rand % 5 == 0) {
				int sum = 0;
				int n;
				for ( n = 1; n <= rand; n++) {
					sum += n;
					System.out.println(sum);
				}
				 
			} else if (rand == 11 || rand == 17 || rand == 19) {
				System.out.println( "반복");
				break;
			}
			else
		 	System.out.println("재수행");
			continue;
		}
	}

}
