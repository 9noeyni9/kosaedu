package day2;

public class IfTest2 {

	public static void main(String[] args) {// 조건에 따라 수행할지 안 할지 정하겠다=>if문
		int num = (int)(Math.random()*10)+1;//1부터 10사이에 난수가 되도록 코드 작성
		System.out.println(num);
		System.out.println(1);
		if (num % 2 == 1)
			System.out.println(2);
		System.out.println(3);
		if (num % 2 == 0)
			System.out.println(4);
		System.out.println(5);
	}

}
