package day7;

public class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);	
		System.out.println(p3.getLocation());
	}
}
class Point {
	int x;	
	int y;
	Point(int x, int y) {	
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}
class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {	
		super(x,y);//아규먼트 직접 호출
		this.z = z;		
	}
	String getLocation() {	// 오버라이딩
		return super.getLocation() + ", z :" + z;
		// x와 y에 대한 정보는 부모의 getLocation으로 호출하면 됨(super)
	}	
}













