package lab.day6;
//생성자 없이 해야 함! 조건 잘 따져야함

class Member{
	String name;
	String account;
	String passwd;
	int birthday;
	
	Member(String name, String account, String passwd, int birthday) { 
		
		this.name = name; 
		this.account = account;
		this.passwd = passwd;
		this.birthday = birthday;
	}
}


public class MemberTest {

	public static void main(String[] args) {

		Member member1 = new Member("보라돌이","purple@gmail.com","purple",940101);
		Member member2 = new Member("뽀", "red@daum.net", "red",951212);
		Member member3 = new Member("뚜비","green@naver.com","green",960303);
		
//		Member mem1 = new Member();
//		
//		mem1.name ="";
//		mem1.account ="";
//		mem1.passwd ="";
//		mem1.birthday="";
	
		
		
		System.out.print("회원1 : " + member1.name +"(" + member1.account+", " + member1.passwd + ", " + member1.birthday+ ")");
		System.out.print("회원1 : " + member2.name +"(" + member2.account+", " + member2.passwd + ", " + member2.birthday+ ")");
		System.out.print("회원1 : " + member3.name +"(" + member3.account+", " + member3.passwd + ", " + member3.birthday+ ")");
		
//		System.out.printf();
	}

}
