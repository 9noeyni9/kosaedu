package day6;

//같은 package안에 똑같은 이름의 클래스가 두개 이상 있을 수 없음
class Student4 { // public일 수 없음 (public은 어디서든 접근 가능한 접근 제어자임)

	String name;
	int age;
	String subject;

	Student4() { // this는 꼭 써야만 할 때 쓰기 지금 여기 경우는 없어도 알아서 멤버변수 찾아가므로 안 써도 됨
		this("듀크", 28, "스프링");// this는 1.변수로 사용할 때 2.메서드로 사용할 때
//		this뒤에 소괄호 있으면 메서드 없으면 변수 this는 변수로 사용될 때 자동으로 생성됨
//		생성자 메서드에서만 사용 가능 일반 메서드 안에선 사용 불가능
//		this메서드 호출하는 식은 반드시 첫행에 와야 함!(왜? : 상속과 연관이 있음 나중에 배움)
		System.out.println("호출");
//		this는 생성자 내에서 다른 생성자 호출하는 역할
	}

	Student4(String name, int age, String subject) { // 생성자 메서드

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

	void setSubject(String subject) {
		this.subject = subject;
	}

}

public class StudentTest4 {
	public static void main(String[] args) {

		Student4[] st = new Student4[4];

		st[0] = new Student4("둘리", 10, "HTML5"); // Student 클래스가 비어있으면 멤버 정의 안된 클래스
		st[1] = new Student4("또치", 10, "CSS3");
		st[2] = new Student4("도우너", 10, "JavaScript");
		st[3] = new Student4();

		for (Student4 obj : st) {
			System.out.println(obj);
			obj.printStudentInfo();
			obj.study();
		}
		st[3].setSubject("JPA");
		st[3].study();
	}

}
