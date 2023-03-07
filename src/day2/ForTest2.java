package day2;

public class ForTest2 {
	public static void main(String[] args) {
		 double rand;
		 for(int num=1; num <= 10; num++) { // 여기서 num은 반복횟수
			    rand = Math.random(); //rand 여기서 double rand = Math.random();로 선언할 수 있는데 이렇게 되면 반복하는 만큼 메모리 쌓인다고 보면 돼
			                          //반복문 안에서 데이터 쌓이는 변수 선언하는 습관은 좋지 않은 습관!
		 		System.out.println(rand);
		 		System.out.println(rand*6);
		 		System.out.println((int)(rand*6));
		 }
	}
}
