package day7;
public class BlockTest {
	static {//(클래스가 로딩될 때 수행되므로 main보다도 먼저 수행됨)
//		main보다 먼저 수행하고 싶을 때
		System.out.println("static 블럭 수행");
	}//static block
	{//얘는 객체생성될 때, 생성자보다 먼저 생성됨
		System.out.println("instance 블럭 수행");
	}//instance block
	public BlockTest() {     
		System.out.println("생성자 수행");
	}
	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();//메인메서드가 자기를 포함한 
		System.out.println(bt);
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
		System.out.println(bt2);
	}
}
