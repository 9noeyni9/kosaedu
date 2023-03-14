package exercise;

class Human {

	String name;
	int age,height,weight;

	public Human() {
	}

	public Human(String name, int age, int height, int weight) {

		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String printInformation() {

		return name+" " + age +" "+ height+" " + weight;
	}
}

class Student extends Human{
	
	String name, number, major;
	int age,height,weight;

	public Student() {
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		
		super(name,age,height,weight);
		this.number = number;
		this.major = major;

	}

	public String printInformation() {

		return super.printInformation()+" " + number+" " + major;
	}

}

public class StudentTest {
	public static void main(String[] args) {
		
		Student array[] = new Student[3];
		
		array[0] = new Student("김라일",20,200,90,"230101","수학");
		array[1] = new Student("강다람",22,170,70,"230314","물리");
		array[2] = new Student("고장미",21,190,80,"230707","화학");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i].printInformation());
		}

	}

}
