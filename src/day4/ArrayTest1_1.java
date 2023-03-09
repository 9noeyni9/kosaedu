package day4;

public class ArrayTest1_1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		System.out.println(score);
		System.out.println(score.length);
		
		//for-each문
		//element 담는 변수
		for (int e : score)// e : 뒤에 오는 객체는 아무값이나 올 수 없고 (literal값이 와야 한다고..?) 
			System.out.println(e);//score값에 담겨있는 값들을 전달해 수행하는 역할만 해주고 이 score로 값변경은 불가함, 값변경하려면 traditional for 써야함
		
		for(int i=0; i < score.length; i++)
            score[i] = (i+1)*100;
		
		for (int e : score)
			System.out.println(e);
	}
}


