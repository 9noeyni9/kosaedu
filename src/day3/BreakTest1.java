package day3;

public class BreakTest1 {      

	public static void main(String[] args) {
		int result;
		unico : for(int dan = 1; dan <= 9; dan++) { //밖에 for문에 라벨을 설정
			for(int num=1; num <= 9; num++) {
				result = dan*num;
				if (result >= 30)
					break unico; // break; 안에 반복문 하나만 break됨 개행 처리 후 밖에 반복문 그 다음 단으로 감 
				System.out.print(dan + "x" + num + "=" + result + "\t");
			}
			System.out.println();
		}		
	}
}
