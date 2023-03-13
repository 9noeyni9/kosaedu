package lab.day6;

class Book {

	String title;
	String author;
	int price;

	Book() {
		this("이것이 자바다", "구인영", 500000);
	}

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void getBookInfo() {
		System.out.println(title + " " + author + " " + price);
	}

}

public class BookTest {

	public static void main(String[] args) {

		Book[] bk = new Book[5];

		bk[0] = new Book("해리포터", "조앤k롤링", 15000);
		bk[1] = new Book("보건교사 안은영", "정세랑", 20000);
		bk[2] = new Book();
		bk[3] = new Book("마법소녀 은퇴합니다", "박서련", 20000);
		bk[4] = new Book("파과", "구병모", 30000);

		for(Book bookinfo : bk) {
			bookinfo.getBookInfo();
		}
	}

}
