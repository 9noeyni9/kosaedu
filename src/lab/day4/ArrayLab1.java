package lab.day4;

public class ArrayLab1 {
	public static void main(String[] args) {
		int[] ary = new int[10];
		
		for(int e : ary)
			System.out.print(e +" ");
		
		System.out.println();
		
		for(int i=0; i < ary.length; i++) {
            ary[i] = (i+1)*10;
	    	   }
		System.out.println();
		
		
		
		System.out.println();
		System.out.println("첫 번째 : "+ary[0]);
		System.out.println("마지막 : " +ary[ary.length-1]);
		System.out.println("합 : "+(ary[0]+ary[ary.length-1]));
		
		for(int e : ary)
			System.out.print(e +" ");
		
		System.out.println();
		
		for (int i=0; i < ary.length; i++)
			System.out.print(ary[ary.length-(i+1)] + " ");
		
		System.out.println();
		
		for (int i=0; i < ary.length; i++) {
			if(i%2==1)
			System.out.print(ary[i] + " ");
		}
		
		
		

	}
	
	

}
