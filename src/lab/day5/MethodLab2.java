package lab.day5;

public class MethodLab2 {

	public static void main(String[] args) {
		getTriangle('@', 3);
		getTriangle('%', 4);
		getTriangle('A', 5);
	}

	static void getTriangle(char deco, int tri) {
		for (int i = 1; i <= tri; i++) {
//			for(;;) {
//				System.out.print(" ");
//			}
			for (int j = 1; j <= i; j++) {
				System.out.print(deco);
			}System.out.println();
			
		}System.out.println();
	}
}

//for(int k=tri-1;k>=0;k--)
//	System.out.print(" ");
