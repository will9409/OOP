import java.util.Scanner;


public class CompareNum {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = 0;
		int d = 0;
		
		if(b>100 || b<1) {
			System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
			return;
		}
		else
		{
			c = b%10;
			b -= c;
			d= (b%100)/10;
		}
		if(c == d) {
			System.out.println("10���ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println("10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
	}

}