package lab.day4;

public class TwoArrayLab3 {
	public static void main(String[] args) {
		int[][] timeArr = { { 5, 2, 1, 0, 2, 3, 6 }, { 4, 3, 2, 1, 1, 0, 5 }, { 3, 1, 2, 1, 3, 1, 3 },
				{ 4, 3, 1, 0, 4, 2, 7 } };

		int sumColArr[] = new int[7];

			for (int j = 0; j < timeArr[0].length; j++) {
				for (int row = 0; row < timeArr.length; row++)
					sumColArr[j] += timeArr[row][j];

				System.out.println(sumColArr[j]);
			}

		System.out.println();

		int sumRowArr[] = new int[4];

		for (int i = 0; i < timeArr.length; i++) {
			for (int col = 0; col < timeArr[i].length; col++)
				sumRowArr[i] += timeArr[i][col];

			System.out.println(sumRowArr[i]);
		}

	}

}
