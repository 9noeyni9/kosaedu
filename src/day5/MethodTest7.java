package day5;
public class MethodTest7 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		System.out.println(args.length);
		System.out.println(args[0]+args[1]+args[2]);
		System.out.println("main() 수행종료");
	}	
}
//String[] args

//왜 메인 메서드는 String[] args 으로 선언을 할까?
//args의 용도 : 실제 타입과 상관없이 문자열로 가게 되있고 배열로 감
//메인메서드는 agrs로 비어있는 배열 전달
