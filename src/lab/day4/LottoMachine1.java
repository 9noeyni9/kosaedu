package lab.day4;

public class LottoMachine1 {

	public static void main(String[] args) {

		int[] arrLt = new int[6];
		int i,j;
		System.out.print("오늘의 로또 번호 : ");
		for (i = 0; i < arrLt.length; i++) {
			arrLt[i] = (int) (Math.random() * 45) + 1;
			//중복값 없게 숫자 뽑기
			for(j=0;j<i;j++) {
			if(arrLt[i]==arrLt[j])
				i--; //i 값 무조건 증가시키는 거 아님 중복값 나오면 i 줄이고 감
			}
			}
		for(i=0;i<arrLt.length;i++) {
			if (i < arrLt.length - 1)
				System.out.print(arrLt[i] + ", ");
			else
				System.out.println(arrLt[i]);
		}

	}

}
