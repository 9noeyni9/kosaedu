package day3;

public class ForTest6 {      

	public static void main(String[] args) {
		final char DECO = '*'; //char DECO = '*'변수선언 할 때 이 앞에 final 붙이면 값이 들어간 이후부터 못 바꾸는 변수로 만들겠다는 뜻 --> 상수
		// 메소드 오버라이딩 불가, 재선언 불가
		//final char DECO ; 이렇게도 선언 가능하고 한번만 값넣기 가능
		int count = (int)(Math.random()*20);
		for(int n=0; n < count; n++)
			System.out.print(DECO);		
	}
}
//반복문이 몇번 반복할지 난수로 결정 미리 몇번 돌지 알 수 없음