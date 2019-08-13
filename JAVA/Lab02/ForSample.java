
public class ForSample {

	public static void main(String[] args) {
		int a = 0;
		for(int i = 1; i < 11;i++) {
			if( i != 10) {
			System.out.print(+i+"+");
			a += i;
			}
			else {
			a += i;
			System.out.print(+i+"="+a);
			}
		}

	}

}
