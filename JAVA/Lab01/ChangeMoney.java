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
		
		System.out.print("오만원권 "+b+"매, 만원권"+c+"매, 천원권"+d+"매, 500원짜리 동전"+e+"개, 100원짜리 동전"+f+"개, 50원짜리 동전"+g+"개, 10원짜리 동전"+h+"개 이다.");

	}

}
