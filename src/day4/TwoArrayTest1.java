package day4;

public class TwoArrayTest1 {
	public static void main(String[] args) {
		int[][] two = new int[2][10];
		System.out.println(two);//행의 참조값
		System.out.println(two[0]); //첫번째 행의 열 배열의 참조값
		System.out.println(two[0][0]);//첫번째 행의 첫번째 열	
		System.out.println(two.length); // 행의 개수
		System.out.println(two[0].length);//열의 개수
		
		for(int row=0;row < two.length;row++) {
			for(int col=0; col < two[row].length; col++)
				System.out.print(two[row][col]+" ");
			System.out.println();
		}
	}
}



