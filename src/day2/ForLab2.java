package day2;

public class ForLab2 {
	public static void main(String[] args) {
		int num;
		char res;
		
		for(num =9;num >=4;num--) {
			if(num % 2==0)
//				 System.out.println(num + " : 짝수");
				res='짝';
			else
//				System.out.println(num + " : 홀수");
				res='홀';
			System.out.println(num +": "+res +"수");
		}
	}

}
