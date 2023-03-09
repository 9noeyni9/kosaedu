



package day4;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		System.out.println(score);
		System.out.println(score.length);
		
		for (int i=0; i < score.length; i++) //인덱스 범위 잘 생각해야해 벗어나면 에러
			System.out.println(score[i]);  //모든 element값 초기화 한 0 값을 읽어오는 r-value
		
		for(int i=0; i < score.length; i++)
            score[i] = (i+1)*100; //각각의 element가 l-value
		
		for (int i=0; i < score.length; i++)
			System.out.println(score[i]); // 1차원 @앞에 나오는 건 객체의 타입(배열은 타입명이 따로 없어서 알파벳 하나만 나올 듯..?)  뒤에 나오는 건 참조값
	}
}
