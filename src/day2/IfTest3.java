package day2;

public class IfTest3 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 10) + 1;
		System.out.println("추출된 num 값 : " + num);
		System.out.println(1);
		if (num % 2 == 1)
			System.out.println(2);
		System.out.println(3);
		if (num % 2 == 0) {
			System.out.println(4);
			System.out.println(5);
		} // 수행할 문이 두개 이상일 땐 블록으로 묶어줘야함!
		System.out.println(6);
		System.out.println(7);
	}

}
