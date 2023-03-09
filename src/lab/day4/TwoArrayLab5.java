package lab.day4;

public class TwoArrayLab5 {
	public static void main(String[] args) {
		int[][] Arr1 = new int [5][3];
		
		for(int i=0;i<Arr1.length;i++) {
			for(int j=0; j<Arr1[i].length;j++)
				System.out.print(Arr1[i][j] + " ");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<Arr1.length;i++) {
			for(int j=0; j<Arr1[i].length;j++) {
				if(j==0) {
				Arr1[i][j]=i+1;
				System.out.print(Arr1[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}

}
