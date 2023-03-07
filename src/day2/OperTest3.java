package day2;
public class OperTest3 {
	public static void main(String[] args) {
		double r_num = Math.random(); //실수, 문자열, 숫자 등등 원하는 결과값에 맞게 타입 설정하기
		System.out.println(r_num);
		double r_num2 = r_num * 10;
		System.out.println(r_num2);
		int r_num3 = (int)r_num2;     
		System.out.println(r_num3); 
		System.out.println(r_num3+1); 
	}
}
