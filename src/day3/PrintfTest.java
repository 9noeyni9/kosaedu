package day3;
public class PrintfTest {
	public static void main(String[] args) {
		System.out.printf("테스트입니당%n");	
		System.out.printf("테스트%d입니당\n",10);		
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100); //%는 포맷  // 정수 16진수   문자
		System.out.printf("%d %1$x %1$o %1$c\n", 100); //포맷 문자 4개인데 매칭문자는 하나 왜 에러 안 났나? --> 1$가 첫번째 매칭값으로 값내라는 뜻 첫번째는 매칭문자 있으니까 굳이 안 쓴 것 안 쓰는 게 맞음
		System.out.printf("0x%X 0x%x\n",65, (int)'각'); //문자형 literal  (int)안 써주면 타입미스매치 에러
		System.out.printf("%c %c %c %c\n", '가', 'A', '!', '3');
		System.out.printf("%b\n", true); //%b 를 binary라 생각하기 쉬움 자바에선 binary를 표현하는 거 없음 boolean
		System.out.printf("%f %e\n", 100.0, 100.0);
		System.out.printf("%.2f\n", 123.5678); //.밑에 숫자만큼만 소수점 아래 자리 나타냄
		System.out.printf("|%s|\n", "자바");
		System.out.printf("|%10s|\n", "자바");//오른쪽 정렬
		System.out.printf("|%-10s|\n", "자바");//왼쪽 정렬
		System.out.printf("%,d원\n", 1000000);	//1000단위마다 ,로 표시해줌		
	}
}








