package lab.day4;

public class TwoArrayLab2 {
	public static void main(String[] args) {
		char[][] chArr = {{'B','C','A','A'},
				          {'C','C','B','B'},
				          {'D','A','A','D'}};
		
		int[] iArr = new int[4];
		int count=0;
		for(int i=0;i<chArr.length;i++) {
			for(int j=0;j< chArr[i].length;j++)
				for(int n=0;n <iArr.length;n++) {
				if(chArr[i][j]=='A'+n) {
					count++;
					iArr[n] = count;
				}
				System.out.println(iArr[n]);
			
			
		}
	}
}
}
