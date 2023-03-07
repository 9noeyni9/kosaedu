package day2;
public class OperTest4 {
	public static void main(String[] args) {
		int num=10;
		System.out.println(num);	//10   			
		System.out.println(++num);	//11 	
		System.out.println(++num);	//12	
		System.out.println(++num);	//13
		System.out.println(num++);	//13 (출력은 이전 거 13이고 num 변수가 14로 올라감)
		System.out.println(num++);	//14 (출력은 이전에 올라온 14 num변수는 15)
		System.out.println(num);     //15  *****(이전 수행이 num++!!)
		System.out.println(--num);	 //14   
		System.out.println(num);	//14		
		
	}
}