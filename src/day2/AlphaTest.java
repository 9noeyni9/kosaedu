package day2;

public class AlphaTest {
	public static void main(String[] args) {
		int num = (int)(Math.random()*26)+1;
		
//		char charn = (char)(num+'A'-1);
				
		System.out.println("추출된 숫자 : " +num);
		System.out.println((char)(num + 'A'-1));
//		System.out.println(charn);
		//대문자 ASCII코드 1~26 사이 아니야ㅠ..
	}

}
