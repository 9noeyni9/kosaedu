package day2;

public class RandomTest { 

	public static void main(String[] args) {
		//Math.random() 다양한 값으로 테스트 해보고 싶을 때 유용
		double rand = Math.random();//0.0<= x <1.0 0~1사이에 무작위 값(난수) 발생
		System.out.println(rand);    
		System.out.println(rand*10); // 0~9사이에 난수
		System.out.println(rand*100); // 0~ 99 사이에 난수
		System.out.println(rand*6);  // 0~5사이에 난수
		
		// int -> 정수값만 구함
		System.out.println((int)(rand*10));  //0~9 
		System.out.println((int)(rand*100));  //0~99
		System.out.println((int)(rand*6));  //0~5
		System.out.println((int)(rand*10)+1);//1~10   
		System.out.println((int)(rand*100)+1);  //1~100
		System.out.println((int)(rand*6)+1);   //1~6
		System.out.println((int)(rand*45)+1);   //1~45
		//(int)(Math.random()*범위)+시작값
	}

}
