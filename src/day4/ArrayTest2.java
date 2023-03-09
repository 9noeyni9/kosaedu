package day4;

public class ArrayTest2 {

	public static void main(String[] args) {
		int score[] = new int[5];		
		System.out.println(score);
		
		for (int i=0; i < score.length; i++)
			System.out.println(score[i]); //기본값으로 초기화
	
		int[] score1 = new int[]{100, 200, 300, 400}; //score1은 4개의 element들로 이루어짐
		System.out.println(score1);
		
		for (int i=0; i < score1.length; i++)
			System.out.println(score1[i]);
		
		int[] score2 = {1000, 2000};	// 배열변수 선언을 함께 하는 경우에만 가능	
		System.out.println(score2);
		for (int i=0; i < score2.length; i++)
			System.out.println(score2[i]);
		
		
		//얘는 배열변수가 이미 선언되어있는 경우이기 때문에 중괄호로만 배열 생성하려고 하면 에러
		score2 = new int[]{11, 22, 33, 44, 55};//이미 선언되어있는 score2배열에 새로운 배열을 참조하겠다 이 이후부터는 {1000,2000}을 참조하지 않음 garbage가 됨=> 이 분류는 JVM이 알아서 함
		System.out.println(score2);
		for (int i=0; i < score2.length; i++)
			System.out.println(score2[i]);		
	}
}
