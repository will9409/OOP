
public class DObject {
	public DObject next;

	public DObject() { next = null;}
	 public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	public void draw() { // �޼ҵ� �������̵�
		 System.out.println("Line");
	}
}

class Rect extends DObject {
	public void draw() { // �޼ҵ� �������̵�
		 System.out.println("Rect");
	}
}

class Circle extends DObject {
	public void draw() { // �޼ҵ� �������̵�
		 System.out.println("Circle");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
	}
	
	
}
