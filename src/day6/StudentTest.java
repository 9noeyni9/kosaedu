package day6;


class Student{ //public일 수 없음 (public은 어디서든 접근 가능한 접근 제어자임)
	
	String name;
	int age;
	String subject;
	
	void printStudentInfo() {
		System.out.printf("%s 학생의 나이는 %d입니다.\n", name, age);
	}
	
	void study() {
		System.out.printf("%s 학생은 %s 과목을 학습합니다. \n", name, subject);
	}
	
}
	
public class StudentTest {
	public static void main(String[] args) {
		
		Student st1 = new Student(); //Student 클래스가 비어있으면 멤버 정의 안된 클래스
		Student st2 = new Student();
		
		System.out.println("st1이 참조하는 객체 정보 : " + st1);
		System.out.println("st2이 참조하는 객체 정보 : " + st2);
		
		st1.printStudentInfo(); 
		st1.study();
		
		st1.name = "둘리";
		st1.age = 10;
		st1.subject = "HTML5";
		
		st1.printStudentInfo(); 
		st1.study();
		
		st2.name = "또치";
		st2.age = 10;
		st2.subject = "CSS3";
		
		st2.printStudentInfo(); 
		st2.study();
		
		st2 = st1; // st1의 값을 st2에게 넣어준 것 st2도 둘리 객체 참조하게 된 것
		System.out.println("st1이 참조하는 객체 정보 : " + st1);
		System.out.println("st2이 참조하는 객체 정보 : " + st2);
		st2.printStudentInfo(); 
		st2.study();
		
	}

}
