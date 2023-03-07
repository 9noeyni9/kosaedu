package day2;

public class TimeTest { //수식을 좀 가독성있게 써보기

	public static void main(String[] args) {
		
		int time = 32150;
		
		int h = (time / 60)/60;
		
		int m = (time % (60*60))/60;
		
		int s = (time%(60*60))%60;
		//수식 쓸 때 풀어서 쓸 것
		
		System.out.println("시간은 : " + time +" 이고 " + h + "시간" + m + "분" + s + "초");
		
	}

}
