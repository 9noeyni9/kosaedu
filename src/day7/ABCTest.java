package day7;
/*
 *  - 객체 생성시 호출되는 생성자 메서드는 호출되자마자 조상 클래스의 생성자를 호출하는 특징을 가지고 있다. 호출되는 부모 클래스의 생성자는 아규먼트 없는 생성자이다.
    - 부모 클래스에 아규먼트를 받지 않는 생성자가 없는 경우엔 super() 메서드를 이용해서 부모가 가지고 있는 생성자를 직접 호출해야 한다.
 */

class A {
	A() {
		System.out.println("A클래스의 객체 생성!");
	}
}

class B extends A {
	B() {
		System.out.println("B클래스의 객체 생성!");
	}
}

class C extends B {
	C() {
		System.out.println("C클래스의 객체 생성!");
	}
//class A {
//	A() {
//	    super();
//		System.out.println("A클래스의 객체 생성!");
//	}
//}
//class B extends A {
//	B(int num) {
//	    super();
//		System.out.println("B클래스의 객체 생성!");
//	}
//}
//
//class C extends B {
//	C() {
//		super(10);
//		System.out.println("C클래스의 객체 생성!");
//		}
//	}
}

public class ABCTest {
	public static void main(String[] args) {
		new C();
	}
}

// C 생성하면 부모클래스인 B 호출 B의 부모 클래서인 A 호출 Object 호출(확인 불가) 내려오면서  A 수행 -> B 수행 -> C 수행
// 