package lab.day4;

public class TwoArrayLab2 {
	public static void main(String[] args) {
		char[][] chArr = { { 'B', 'C', 'A', 'A' }, { 'C', 'C', 'B', 'B' }, { 'D', 'A', 'A', 'D' } };

		int i,j;
		int[] iArr = new int[4];
		int count = 0;
		for ( i = 0; i < chArr.length; i++) {
			for ( j = 0; j < chArr[i].length; j++)
				System.out.println(chArr[i][j]);
		}
		
		
//				for (int n = 0; n < iArr.length; n++) {
//					if (chArr[i][j] == (char) (n + 'A')) {
//						count++;
//					}
//					iArr[n] = count;
//				}
//				for (int e : iArr)
//					System.out.println(e);

	}
}
