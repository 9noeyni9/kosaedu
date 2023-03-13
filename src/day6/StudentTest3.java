package day6;

//같은 package안에 똑같은 이름의 클래스가 두개 이상 있을 수 없음
class Student3{ //public일 수 없음 (public은 어디서든 접근 가능한 접근 제어자임)
	
	String name;
	int age;
	String subject;
	
	Student3(){ //this는 꼭 써야만 할 때 쓰기 지금 여기 경우는 없어도 알아서 멤버변수 찾아가므로 안 써도 됨
		name = "듀크";
		age = 28;
		subject = "스프링";
	}
	
	Student3(String name, int age, String subject) { //생성자 메서드
		
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
	
public class StudentTest3 {
	public static void main(String[] args) {
		
		Student3 st1 = new Student3("둘리",10,"HTML5"); //Student 클래스가 비어있으면 멤버 정의 안된 클래스
		Student3 st2 = new Student3("또치",10,"CSS3");
		Student3 st3 = new Student3();
		
		System.out.println("st1이 참조하는 객체 정보 : " + st1);
		System.out.println("st2이 참조하는 객체 정보 : " + st2);
		System.out.println("st3이 참조하는 객체 정보 : " + st3);
		
		st1.printStudentInfo(); 
		st1.study();		
		st2.printStudentInfo(); 
		st2.study();		
		st3.printStudentInfo(); 
		st3.study();
		
	}

}
