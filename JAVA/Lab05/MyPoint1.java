
public class MyPoint1 extends MyPoint {

	public MyPoint1(int x, int y) {
		super(x, y);
	}
	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	protected void reverse() {
		int temp = x;
		this.x = y;
		this.y = temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyPoint1 p ;
		p = new MyPoint1(1,1);
		p.show();
		p.move(3,5);
		p.show();
		p.reverse();
		p.show();
		
		
		
	}





}
