package day2;

public class ForTest3 {

	public static void main(String[] args) { //몇번 반복, 화면에 어떻게 출력될지
		for(int n=1; n < 20; n++)
			System.out.print(n+ " "); // 19번 1 2 3 4 5 6 ...
		System.out.println();
		
		for(int n=10; n > 0; n--)
			System.out.print(n+ " "); //10번 10 9,....
		System.out.println();
		
		for(int n=1; n < 20; n += 3)
			System.out.print(n+ " "); // 1 4 7 ... 7번
		System.out.println();
		
		// 1월~12월 까지 하나의 행에 출력해 보자. 
		int month=1;
		for(; month <= 12; month++)
			System.out.print(month+ "월 "); //
		System.out.println();
		System.out.println(month);
	}

}
