import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		while(a.hasNext()) {
			double x = a.nextDouble();
			String op = a.next();
			double y = a.nextDouble();
			double z = 0;
			
			switch(op) {
			case "+":
				z = x + y;
				System.out.println(z);
				break;
			case "=":
				if(x==y) {
					z = 1;
				}
				else {
					z = 0;
				}
				System.out.println(z);
				break;
			case "%":
				z = x % y;
				System.out.println(z);
				break;
			case "/":
				if ( y == 0) {
					System.out.println("0Àž·Î ³ªŽ­ Œö ŸøœÀŽÏŽÙ.");
					return;
				}
				z = x / y;
				System.out.println(z);
				break;
			}
		}
		

	}

}
