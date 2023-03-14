package day7;
class Parent {  
	int x = 1, y = 2;
//	@Override  toString()
	public String toString(int n) {
		return "Parent 클래스의 객체 입니당";
	}	//Object 오버로딩
}
class Child extends Parent {
	int x = 10;
	void printInfo() {
		int x = 100;
		System.out.println(x);			//	지역변수 100출력
		System.out.println(this.x);		//  this. --> 멤버변수 10 출력
		System.out.println(super.x);	//	super. --> 조상의 x : 1출력
		System.out.println(y);			//  같은 메소드 안에 지역변수 없음 부모 클래스에도 없어서 조상까지 가야 함 2
		System.out.println(this.y);		//	2
		System.out.println(super.y);	//  2	
//		System.out.println(z);          //      
	}
	public String toString() {
		return "Child 클래스의 객체 입니당";
	} //Object 오버라이딩
}

public class ParentChildTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println("출력 1-" + p);
		
		Card c = new Card();
		System.out.println(c.toString());//생략해도 toString()값 자동 출력
		System.out.println("출력 2-" + c);
		
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());
		System.out.println("출력 3-" + d);
		
		Child ch = new Child();
		System.out.println("출력 4-" + ch);
		ch.printInfo();
		System.out.println(ch.x); // 10
		System.out.println(ch.y); // 2
	}
}



