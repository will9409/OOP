import java.util.Scanner;


public class CompareNum {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = 0;
		int d = 0;
		
		if(b>100 || b<1) {
			System.out.println("올바른 입력이 아닙니다.");
			return;
		}
		else
		{
			c = b%10;
			b -= c;
			d= (b%100)/10;
		}
		if(c == d) {
			System.out.println("10의자리와 1의 자리가 같습니다.");
		}
		else
		{
			System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
		}
	}

}