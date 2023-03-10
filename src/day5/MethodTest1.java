package day5;
public class MethodTest1 {
	public static void main(String[] args) {//JVM이 먼저 수행해줌
		System.out.println("main() 수행시작");
		printMyName(); //메서드호출 : 메서드이름()
		System.out.println(1);
		printMyName();
		System.out.println(2);
		printMyName();
		System.out.println(3);
		System.out.println("main() 수행종료");
	}
	static void printMyName() { //호출만 가능 값담기 불가
		System.out.println("유니코");
		return;//return값이 없는 애는 return 결과값 부르면 에러나
		// return문 메서드를 호출한 곳으로 돌아가라 지금은 return문 생략가능 생략해도 JVM한테로 돌아가고 자동적으로 종료됨
	}
}
