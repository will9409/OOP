import java.util.Scanner;

public class MyExp {
	int base;
	int exp;
	
	public int getValue() {
		int s = base;
		for(int i = 0; i < exp-1;i++) {
			s *= base;
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		MyExp myNumber =new MyExp();
		
		myNumber.base = a.nextInt();
		myNumber.exp = a.nextInt();
		
		System.out.println(+myNumber.base+"ÀÇ "+myNumber.exp+"½Â = "+myNumber.getValue());
		
	}

}
