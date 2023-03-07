package day2;

public class ForLab3 {
	public static void main(String[] args) {
		
		int rand = (int)(Math.random()*10)+1;
		
		int rand2 = (int)(Math.random()*10)+30;
		
		
		int sumEven =0;
		
		int num;
		for(num = rand;num<=rand2;num++) {
			if(num%2==0)
				sumEven += num;
		}
	    System.out.println(rand + " 부터 "+rand2+" 까지의 짝수의 합 : "+sumEven);
	}

}
