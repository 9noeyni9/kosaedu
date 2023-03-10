package lab.day5;

public class MethodLab1 {
	public static void main(String[] args) {
		System.out.print("우리의 자바 교재명은 ");
		printTitle("<이것이 자바다>");
		System.out.println(" 입니다.");
		
		System.out.print("가격은 ");
		getPrice(36000);
		System.out.println("원 입니다.");
		
	}
	
	static void printTitle(String bookName){
		System.out.print(bookName);
	}

	static void getPrice(int price) {
		System.out.print(price);
		return;
	}
}
