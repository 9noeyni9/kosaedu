package lab.day6;

import java.util.Scanner;

class GradeExpr{
	
	int[] jumsu;
	int total;
	int avg;
	
	
	private int[] jumsu(int[] score) {
		for(;;)
		return score;
	}
	int getTotal(int total) {
		
		int i=0;
    	int[] score = new int[i];
		for(i=0;i<score.length;i++) {
    		total += score[i];
    	}
		return total;
	}
	
	void setTotal(int total) {
		this.total = total;
	}
	
    double getAverage(double avg){
    	
    	int total;
    	int i;
    	
    	
    	
    	return avg;
	}
    
    int getGoodScore(int[] score){
    	int goodScore=0;
    	
    	for(int i=0;i<score.length;i++) {
    		if(goodScore<score[i]) {
    			goodScore=score[i];
    		}
    	}
    	
    	return goodScore; 
    }
    
    int getBadScore(int[] score) {
    	int badScore=0;
    	
    	for(int i =0;i<score.length;i++) {
    	   if(badScore>score[i]) {
    		   badScore=score[i];
    	   }
    	}
    	return badScore;
    }
    
}

public class GradeTest {

	public static void main(String[] args) {
		
		int i =0;
		int[] score = new int[i];
		
		for(i=0;i<score.length;i++) {
//			Scanner score = new Scanner(System.in);
		}
		
		
	}

}
