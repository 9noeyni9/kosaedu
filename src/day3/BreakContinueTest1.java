package day3;
import java.util.Scanner;
public class BreakContinueTest1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //사용자가 입력할 수 있는 박스
		int num;
		int factNum;
		while(true) {
			System.out.print("양의 숫자를 입력하숑 : ");			
			num = input.nextInt(); //사용자가 입력하기 전까지 무한정 기다림 윈도우즈 운영체제가 쥐고 있으므로 enterkey를 눌러야 전달됨
			if (num > 0)
				System.out.println("입력된 숫자 --> "+num);
			else {
				System.out.println("양수를 입력하지 않아서 수행 종료!!");
				break;
			}	
			factNum = 1;
			for (int i=1; i <= num; i++)
				factNum *= i;
			System.out.println(num+"! --> "+factNum);
		}
		input.close(); //더이상 사용 안 할 땐 close해주는 게 좋음
		System.out.println("수행 끝!!");
	}	
}
