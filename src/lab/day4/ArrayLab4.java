package lab.day4;

public class ArrayLab4 {
	public static void main(String[] args) {
		int aran = (int) (Math.random() * 6) + 5;

		int[] arrR = new int[aran];

		int i;
		for (i = 0; i < arrR.length; i++) {
			arrR[i] = (int) (Math.random() * 26) + 1;
			if (i < arrR.length - 1)
				System.out.print(arrR[i] + ",");
			else
				System.out.print(arrR[i]);
		}
		System.out.println();

		char[] arrC = new char[aran];

		for (i = 0; i < arrC.length; i++) {
			arrC[i] = (char) (arrR[i] + 96);  //**
			if (i < arrC.length - 1)
				System.out.print(arrC[i] + ",");

			else
				System.out.print(arrC[i]);
		}
		
     
//		다른 사람 코드
		
//		int arrLength = (int)(Math.random()*6)+5;
//		int[] arr = new int[arrLength];
//		
//		System.out.println("난수의 값 : " + arrLength);
//		for(int j =0; j<arrLength;i++) {
//			arr[i] = (int)(Math.random()*26)+1;
//		}
//		char[] cArr = new char[arr.length];
//		for(int j =0; j<arrLength;j++) {
//			cArr[i] = (char)(96+arr[i]);
//		}
//		
//		for(int j = 0; j<arrLength-1;i++) {
//			System.out.println(arr[i]+" ");
//		}
//		System.out.println(arr[arrLength-1]);
//		for (int j = 0; j < arrLength-1; j++) {
//			System.out.println(cArr[i] + ",");
//		}
//		System.out.println(cArr[arrLength-1]);
	}

}
