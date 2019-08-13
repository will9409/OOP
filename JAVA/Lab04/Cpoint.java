
public class Cpoint {
	
	private int a;
	private int b;
	public Cpoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void show() {
		System.out.println("("+a+","+b+") ");
	}
	public void show(String color) {
		System.out.println("("+a+","+b+") "+color);
	}
	@Override
	public String toString() {
		return "("+this.a+","+this.b+") ¿‘¥œ¥Ÿ.";
	}

}
