package day5;

public class MethodTest4 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName(3, '*');
		printMyNameStr("듀크", '$');
		printMyNameStr("듀크", '$');
		printMyNameStr("듀크", '$');
		printMyNameStr("턱시", '!');
		printMyName2(3, "자바" ,'&');		
		System.out.println("main() 수행종료");
	}

	static void printMyName(int num, char deco) {
		for (int i = 1; i <= num; i++)
			System.out.println(deco + "유니코" + deco);
	}

	static void printMyNameStr( String name, char deco) {
			System.out.println(deco + name + deco);
	}
	
	static void printMyName2(int num, String name ,char deco) {
		for (int i = 1; i <= num; i++)
			System.out.println(deco + name + deco);
	}
}
