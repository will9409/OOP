
public class Rect {

	int width;
	int height;
	public Rect(int a , int b) {
		this.width = a;
		this.height = b;
	}
	public boolean equals(Rect x) {
		if((this.width*this.height) == x.width*x.height) {
			return true;
		}
		else
			return false;
	}
}
