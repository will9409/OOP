import java.util.Scanner;

public class ArithmeticException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner a = new Scanner(System.in);
		int b = 0, c = 0;
		System.out.print("�������� �Է��Ͻÿ�:");
		b = a.nextInt();
		System.out.print("�������� �Է��Ͻÿ�:");
		c = a.nextInt();
		
		try {
			System.out.println(b+"�� "+c+"�� ������ ���� "+b/c+"�Դϴ�.");
		}catch(java.lang.ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}

	}

}
