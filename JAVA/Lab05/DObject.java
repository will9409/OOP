
public class DObject {
	public DObject next;

	public DObject() { next = null;}
	 public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	public void draw() { // 메소드 오버라이딩
		 System.out.println("Line");
	}
}

class Rect extends DObject {
	public void draw() { // 메소드 오버라이딩
		 System.out.println("Rect");
	}
}

class Circle extends DObject {
	public void draw() { // 메소드 오버라이딩
		 System.out.println("Circle");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
	}
	
	
}
