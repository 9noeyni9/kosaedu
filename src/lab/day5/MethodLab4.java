package lab.day5;

public class MethodLab4 {
	public static void main(String[] args) {
		
		int ran1,ran2;
		ran1 = (int)(Math.random()*30)+1;
		ran2 = (int)(Math.random()*30)+1;
		
		calNum(ran1,ran2);
		
		
	}

	static void calNum(int num1, int num2) {
		if (num1 >= num2)
			for(int i=1;i<=5;i++)
			System.out.println(num1+" 와 " + num2+ "의 차는 "+(num1 - num2)+"입니다.");
		else
			for(int i=1;i<=5;i++)
				System.out.println(num2+" 와 " + num1+ "의 차는 "+(num1 - num2)+"입니다.");
		return;
	}

}
