import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int money = a.nextInt();
		int b = (money/50000)%50000;
		money = money - b*50000;
		int c = (money/10000)%10000;
		money = money - c*10000;
		int d = (money/1000)%1000;
		money = money - d*1000;
		int e = (money/500)%500;
		money = money - e*500;
		int f = (money/100)%100;
		money = money - f*100;
		int g = (money/50)%50;
		money = money - g*50;
		int h = (money/10)%10;
		
		System.out.print("�������� "+b+"��, ������"+c+"��, õ����"+d+"��, 500��¥�� ����"+e+"��, 100��¥�� ����"+f+"��, 50��¥�� ����"+g+"��, 10��¥�� ����"+h+"�� �̴�.");

	}

}
