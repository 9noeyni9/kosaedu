package lab.day3;

public class WhileLab3 {
	public static void main(String[] args) {
		while(true) {
			int rand = (int)(Math.random()*30);
			if(rand>=1 && rand<=26) {
				System.out.printf("%d - %1$c, %1$d, 0x%X \n",(rand+'A'+1),(rand+'A'-1) );
			}
			else {
				System.out.println("수행 끝");
			    break;
			}
			    
		}
	}

}
