package day2;

public class OperTest9 {
	public static void main(String[] args) { //단독으로 쓰일 때 ++,--이 앞에 있던 뒤에 있던 상관x
		int num = 100;
		num++;
		System.out.println(num);//100(101)
		++num;
		System.out.println(num);//102
		--num;
		System.out.println(num);//101
		num--;
		System.out.println(num);//101
		System.out.println("---------------------");
		int result;
		result = num; //100
		System.out.println(result + " : " + num);//100 : 100
		result = num + 1; 
		System.out.println(result + " : " + num); //101 : 100
		result = ++num;
		System.out.println(result + " : " + num); //102 : 
		result = num++;
		System.out.println(result + " : " + num); //102
	}
}
