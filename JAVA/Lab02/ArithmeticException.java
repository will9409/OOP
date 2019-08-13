import java.util.Scanner;

public class ArithmeticException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner a = new Scanner(System.in);
		int b = 0, c = 0;
		System.out.print("나뉨수를 입력하시오:");
		b = a.nextInt();
		System.out.print("나눗수를 입력하시오:");
		c = a.nextInt();
		
		try {
			System.out.println(b+"를 "+c+"로 나누면 몫은 "+b/c+"입니다.");
		}catch(java.lang.ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

}
