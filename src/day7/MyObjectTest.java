package day7;

class MyObject extends Object { //extends Object 지정 안 해주면 자동으로 Object를 상속받기 때문에 여기서는 생략 가능
	void printName() {
		System.out.println("자바듀크");
	}
	
	public String toString() {
		return "Object의 자식 클래스인 MyObject 객체임";
	}//메서드 오버라이딩 : 조상에게 물려받은 메서드를 수행코드만 달리하여 다시 재정의하는 것
	 // 메서드 오버라이딩을 할 때 조건을 동일하거나 더 크게 줘야 하므로 public을 오버라이딩 할 때 public을 주는 수 밖에 없음
}


public class MyObjectTest {
	
	public static void main(String[] args) {
		
		MyObject my = new MyObject();
		System.out.println(my.toString());
		System.out.println(my);
		System.out.println("출력 "+my);
		my.printName();
		
	}

}
