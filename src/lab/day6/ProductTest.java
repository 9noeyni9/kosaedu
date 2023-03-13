package lab.day6;

class Product{
	String name;
	int balance;
	int price;
	
	
	
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	Product(){
		this("듀크인형",5,10000);
	}
	
	void getName(){ //getter메서드
		System.out.print(name);
	}
	
	void getBalance() {
		System.out.print(balance);
	}
	
	void getPrice() {
		System.out.printf("%,d원\n",price);
	}
	
}

public class ProductTest {

	public static void main(String[] args) {
		
		Product[] product = new Product[5];
		
		product[0] = new Product("보라돌이인형", 10, 13000);
		product[1] = new Product("뽀인형",1,20000);
		product[2] = new Product("나나인형",3,18000);
		product[3] = new Product("뚜비인형",11,13000);
		product[4] = new Product("해인형",2,20000);
		
		for(Product teletubbies : product) {
			teletubbies.getName();
			System.out.println();
			teletubbies.getBalance();
			System.out.println();
			teletubbies.getPrice();
			System.out.println();
		}

	}

}
