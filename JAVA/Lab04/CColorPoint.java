
public class CColorPoint extends Cpoint {
	String color;
	public CColorPoint(int a, int b,String c) {
		super(a, b);
		this.color = c;
	}
	public void show() {
		super.show(color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cpoint a,b;
		a = new Cpoint(2,3);
		b = new CColorPoint(3,4,"red");
		a.show();
		b.show();
		System.out.println(a);
		System.out.println(b);
	}

}
