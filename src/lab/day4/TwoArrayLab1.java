package lab.day4;

public class TwoArrayLab1 {

	public static void main(String[] args) {

		int[][] twoAr = { { 10, 12, 14, 16 }, { 18, 20, 22, 24 }, { 26, 28, 30, 32 }, { 34, 36, 38, 40 } };

		System.out.println("1행 1열의 데이터 : " + twoAr[0][0]);
		System.out.println("3행 4열의 데이터 : " + twoAr[2][3]);

		System.out.println("행의 개수 : " + twoAr.length);
		System.out.println("열의 개수 : " + twoAr[0].length);

		System.out.print("3행의 데이터들 : ");
		for (int row = 0; row < twoAr.length; row++) {
			for (int col = 0; col < twoAr[row].length; col++) {
				if (row == 2) {
					System.out.print(twoAr[row][col] + " ");
				}
			}
		}

		System.out.println();

		System.out.print("2열의 데이터들 : ");
		for (int row = 0; row < twoAr.length; row++) {
			for (int col = 0; col < twoAr[row].length; col++) {
				if (col == 1) {
					System.out.print(twoAr[row][col] + " ");
				}
			}
		}
		System.out.println();

		System.out.print("왼쪽 대각선 데이터들 : ");
		for (int row = 0; row < twoAr.length; row++) {
			for (int col = 0; col < twoAr[row].length; col++) {
				if (row == col) {
					System.out.print(twoAr[row][col] + " ");
				}
			}
		}

		System.out.println();

		System.out.print("오른쪽 대각선 데이터들 : ");
		for (int row = 0; row < twoAr.length; row++) {
			for (int col = 0; col < twoAr[row].length; col++) {
				if (1==1) {
					System.out.print(twoAr[row][col] + " ");
				}
			}
		}

	}

}
