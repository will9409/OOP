
public class ColorPoint extends Point {

	String color;
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public void showColorPoint() {
		System.out.print(this.color);
		showPoint();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
	}


}
