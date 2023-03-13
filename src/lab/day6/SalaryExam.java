package lab.day6;
// import MethodLab5 생각해보기
class SalaryExpr {

	int bonus;

	SalaryExpr() {
//		this(100);
//		this(0); //이것도 생략 가능
	}

	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}

	int getSalary(int grade) {
      int result=0;
	
//		int bonus = 100; //동급 비교할 땐 switch문 ㅡㅡ^
//		if (grade == 1)
//			bonus = bonus + 100;
//		else if (grade == 2)
//			bonus = bonus + 90;
//		else if (grade == 3)
//			bonus = bonus + 80;
//		else
//			bonus = bonus + 70;
//
//		return bonus; //bonus는 bonus저장 변수...ㅠ
		
	 
		switch(grade) {
		case 1: result = bonus + 100;
		case 2: result = bonus + 90;
		case 3: result = bonus + 80;
		case 4: result = bonus + 70;
		}
		return result;
	
	}

}

public class SalaryExam {
	public static void main(String[] args) {
//      SalaryExpr salary = new SalaryExpr();
		SalaryExpr salary;

		int month = (int) (Math.random() * 12) + 1;  //MethodLab5 import로 해결해보기
		int grade = (int) (Math.random() * 4) + 1;

		if (month % 2 == 0) {
//			plus.getSalary(grade);
			salary = new SalaryExpr(100);
//			System.out.printf("%d월 %d등급의 월급은 %,d입니다.", month, grade, salary.getSalary(grade));
			
		} else {
//			plus.getSalary(grade);
			salary = new SalaryExpr();
//			System.out.printf("%d월 %d등급의 월급은 %,d입니다.", month, grade, salary.getSalary(grade));
		}
	}
}
