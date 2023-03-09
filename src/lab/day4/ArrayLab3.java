package lab.day4;

public class ArrayLab3 {

	public static void main(String[] args) {

		char[] arrCh = { 'J', 'a', 'v', 'a' };
		int i;
		for (i = 0; i < arrCh.length; i++) {
			if (arrCh[i] >= 'A' && arrCh[i] <= 'Z') //범위 설정할 때 숫자보다 문자로 표시하는 게 좋음
				arrCh[i] += 32;
			else
				arrCh[i] -= 32;
			
//			else if(arrCh[i] >= 'a' && arrCh[i] <= 'z')
//				arrCh[i] -= 32;

			System.out.println(arrCh[i]); 
		
		}
		
		for(char c : arrCh)     //for-each문 사용해서 출력하기
		System.out.println(c);

	}

}
