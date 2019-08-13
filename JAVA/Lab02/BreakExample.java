import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int c = 0;
		while(true) {
			int b = a.nextInt();
			c++;
			if(b==-1) {
				c--;
				break;
			}
		}
		System.out.println("입력된 숫자 개수는 "+c);
	}

}
