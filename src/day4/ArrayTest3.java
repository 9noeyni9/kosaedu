package day4;

public class ArrayTest3 {
	public static void main(String[] args) {
		// 여러 타입의 변수들을 한번에 만들어줌 빈괄호 타입명 뒤에도 가능 변수명 뒤에도 가능
		boolean a1[] = new boolean[10];
		int a2[] = new int[5];
		long a3[] = new long[20];
		double a4[] = new double[3]; 
		
		System.out.println(a1);
		System.out.println(a1.length);
		
		System.out.println(a2);
		System.out.println(a2.length);
		
		System.out.println(a3);
		System.out.println(a3.length);
		
		System.out.println(a4);
		System.out.println(a4.length);
		
		a2 = new int[100];
		System.out.println(a2);
		System.out.println(a2.length);
		
	}
}
