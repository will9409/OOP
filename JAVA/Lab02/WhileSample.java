import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int c = 0;
		int b = 0;
		
		while(true) {
			int a = s.nextInt();
			b += a;
			c++;
			if(a == 0) {
				c--;
				b = b/c;
				System.out.println("입력된 수의 개수는 "+c+"개이며 평균은 "+b+"입니다.");
			}
		}
		
	}

}
