package day2;
public class IfTest4 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1; // 1~10
		char result;
		if(num % 2 == 1) //if문
			result = '홀';
		else //else절
		    result = '짝';
		System.out.println(num+"은 "+result+"수입니다.");
	}//if문 없이 else절 구현 불가 else절 없이 if문은 구현 가능
}
