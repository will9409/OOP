import java.util.Scanner;


public class Game369 {

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
			if(c == 3 || c==6 || c == 9) {
				d++;
				
			}
			b -= c;
			c = b%100;
			if(c == 30 || c == 60 || c == 90) {
				d++;
			}
		}
		if(d == 1) {
			System.out.println("박수짝");
		}
		else if(d == 2) {
			System.out.println("박수짝짝");
		}
		else
		{
			System.out.println("369가 존재하지않습니다.");
		}
	}

}