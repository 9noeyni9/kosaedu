package day5;
public class MethodTest6 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		System.out.println(add(10, 100));
		System.out.println(add(10, 20, 30));
		int nums[] = {10, 20, 30, 40};
		//System.out.println("nums의 값 : "+nums);
		System.out.println(add(nums));
		System.out.println(add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));	
		System.out.println(add(new int[5]));	
		System.out.println("main() 수행종료");
	}	
	// 메서드 오버로딩
	static int add(int p1, int p2) {
		return p1+p2;
	}
	static int add(int p1, int p2, int p3) {
		return p1+p2+p3;
	}
	
	//배열을 담음
	static int add(int[] p) { //매개변수 p 호출되면 방 만들어지고 호출 끝나면 사라짐
		//System.out.println("p의 값 : "+p);
		int sum = 0;
		for(int i=0; i < p.length; i++)
			sum += p[i];
		return sum;
	}
}
