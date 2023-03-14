package lab.day7;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getInfo() {
		return name;
	}
}

class Friend extends Person {
	private String phoneNum;
	private String email;

	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public String getInfo() {
		
		return super.getInfo()+"    " + phoneNum +"     "+ email;
	}

}

public class FriendTest {

	public static void main(String[] args) {
		
		Friend[] friend = new Friend[5];
		
		friend[0] = new Friend("영이","01000000000","zero@naver.com");
		friend[1] = new Friend("하나","01011111111","one@naver.com");
		friend[2] = new Friend("둘이","01022222222","two@naver.com");
		friend[3] = new Friend("삼순","01033333333","three@naver.com");
		friend[4] = new Friend("넷이","01044444444","four@naver.com");
		
		System.out.println("이름    전화번호          메일주소");
		for(int i =0;i<friend.length;i++) {
			System.out.println(friend[i].getInfo());
		}//foreach문 쓰기

	}

}
