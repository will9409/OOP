import java.util.Scanner;
import java.lang.Math;
public class GamblingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person x = new Person();
		Person y = new Person();
		Scanner s = new Scanner(System.in);
		while(true) {
			
			System.out.println("Person X's turn");
			String q =s.nextLine();
			for(int i = 0 ; i < 3; i++) {
				
				
				double r = Math.random()*4;
				int n = (int)Math.round(r);
				if(i == 0) {
					System.out.println("x의 a는 "+n);
					x.a = n;
				}
				else if(i == 1) {
					x.b = n;
					System.out.println("x의 b는 "+n);
				}
				else
					System.out.println("x의 c는 "+n);
					x.c = n;
				

			}
				
			
			System.out.println("Person Y's turn");
			String t =s.nextLine();
			for(int i = 0 ; i < 3; i++) {

			
				double r = Math.random();
				int n = (int)Math.round(r);
				if(i == 0) {
					System.out.println("y의 a는 "+n);
					y.a = n;
				}
				else if(i == 1) {
					System.out.println("y의 b는 "+n);
					y.b = n;
				}
				else
					System.out.println("y의 c는 "+n);
					y.c = n;
				

			}
			
			if((x.a == x.b && x.b == x.c)) {
				System.out.println("X Won");
				break;
			}
			else if(y.a == y.b && y.b == y.c) {
				System.out.println("Y Won");
				break;
			}
			else
				System.out.println("Tied.");
			
		}
		
	}

}
