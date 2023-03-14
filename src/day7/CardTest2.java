package day7; //클래스 로딩

public class CardTest2{
	public static void main(String args[]) throws Exception{ //메인을 바로 수행하기 위해서 static을 붙여주는 것	
		System.out.println("CardTest 수행이 시작되었습니다.");
		Thread.sleep(10000);//10초 쉬는 것
		Card c1 = new Card();		
		c1.kind = "Heart";
		c1.number = 7;	
		System.out.println("첫 번째 Card 객체가 생성됨");
		Thread.sleep(10000);
		Card c2 = new Card();		
		c2.kind = "Spade";
		c2.number = 4;
		System.out.println("두 번째 Card 객체가 생성됨");
		Thread.sleep(5000);
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");	
		Card.width = 50;
		Card.height = 80;
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
	}
}




