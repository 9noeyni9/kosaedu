package lab.day4;

public class TwoArrayLab4 {
	public static void main(String[] args) {
		int [][] iArr = {{10,20,30,40,50,},
				         {5,10,15},
				         {11,22,33,44},
				         {9,8,7,6,5,4,3,2,1}};
		
		int sumRowArr[] = new int[4];

		for (int i = 0; i < iArr.length; i++) {
			for (int col = 0; col < iArr[i].length; col++)
				sumRowArr[i] += iArr[i][col];

			System.out.println((i+1)+"행의 합은 "+sumRowArr[i] +"입니다.");
		}
	}


}
