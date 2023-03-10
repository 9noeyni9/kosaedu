package lab.day5;

public class MethodLab6 {
	public static void main(String[] args) {
		int i=0;
		int p1[] = new int[i]; 
		for(i=1; i<= p1.length;i++)
			p1[i] = 10*i;
		
		int p2[] = {100,500,300,200,400};
		int p3[] = {1,10,3,4,5,8,7,6,9,2};
	}
	
	static int[] maxNumArray(int[] p) {
		
		int max =0;
		
		for(int i=1;i<p.length;i++){
			if(p[i] > max)
				max = p[i];			
		}
		return p;
	}

}
