package day2;

public class ForTest1_1 {
	public static void main(String[] args) {
		int num; //for문 밖에서 변수 선언
		for(num=1; num <= 10; num++) // for문 밖에서 선언한 변수 for문에서 사용
		   System.out.println(num);
		System.out.println();
		for(num=1; num <= 10; num+=2)
		   System.out.println(num);
		System.out.println(num); //for문 밖에서 선언한 변수이므로 for문 밖에서 사용해도 오류 안 남 ForTest1.java와 비교해보기
	}
}
