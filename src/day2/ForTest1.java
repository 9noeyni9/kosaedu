package day2;

public class ForTest1 {
	public static void main(String[] args) {
		 for(int num=1; num <= 10; num++)
		        System.out.println(num);
		 System.out.println();
		 for(int num=1; num <= 10; num+=2) // for문 block 안에서 변수 선언시 그 변수는 for문안에서만 사용 가능한 block scope임
		        System.out.println(num);
//		 System.out.println(num); //얘 주석 풀었을 때 오류나는 건 block scope기 때문임
	}
}
