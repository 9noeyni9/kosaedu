package day6;

//같은 package안에 똑같은 이름의 클래스가 두개 이상 있을 수 없음
class Student2{ //public일 수 없음 (public은 어디서든 접근 가능한 접근 제어자임)
	
	String name;
	int age;
	String subject;
	
	Student2(String name, int age, String subject) { //생성자 메서드
		
//		name = name; // 똑같은 이름의 멤버변수가 두군데에 있음
//		매개변수에 name을 멤버변수name에 주고 싶은 것
		this.name = name; // this는 자동으로 만들어짐 자기자신에 대한 객체를 참조하게 되어있음
		this.age = age;
		this.subject = subject;		
	}
	
	void printStudentInfo() {
		System.out.printf("%s 학생의 나이는 %d입니다.\n", name, age);
	}
	
	void study() {
		System.out.printf("%s 학생은 %s 과목을 학습합니다. \n", name, subject);
	}
	
}
	
public class StudentTest2 {
	public static void main(String[] args) {
		
		Student2 st1 = new Student2("둘리",10,"HTML5"); //Student 클래스가 비어있으면 멤버 정의 안된 클래스
		Student2 st2 = new Student2("또치",10,"CSS3");
		
		System.out.println("st1이 참조하는 객체 정보 : " + st1);
		System.out.println("st2이 참조하는 객체 정보 : " + st2);
		
		st1.printStudentInfo(); 
		st1.study();
		
		st2.printStudentInfo(); 
		st2.study();
		
		st2 = st1; // st1의 값을 st2에게 넣어준 것 st2도 둘리 객체 참조하게 된 것
		System.out.println("st1이 참조하는 객체 정보 : " + st1);
		System.out.println("st2이 참조하는 객체 정보 : " + st2);
		st2.printStudentInfo(); 
		st2.study();
		
	}

}
