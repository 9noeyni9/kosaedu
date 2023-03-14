package day7;
import java.util.*;
public class KoreanDay {
	public static String day;//여기에 요일 정해버리면 다 그 요일만 나옴
	static String korDayName[] = 
		{"", "일요일","월요일","화요일","수요일",
				"목요일","금요일","토요일"};
	static {
		System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		GregorianCalendar cal = new GregorianCalendar();
//		태양력 기반 달력 
		int numDay = cal.get(Calendar.DAY_OF_WEEK);//상수값 전달
		day = korDayName[numDay];		
	}
}
