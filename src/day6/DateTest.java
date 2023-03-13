package day6;
import java.util.Date;



public class DateTest {
	public static void main(String[] args) {
		
//		java.util.Date today = new java.util.Date();//import 안 하고 하려면 이렇게!
		Date today = new Date();
		System.out.println(today.toString());
		System.out.println(today.toLocaleString());
		
	}

}
