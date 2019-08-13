import java.util.Scanner;
public class Calculate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		String c = s.next();
		
		int answer = 0;
		switch(c) {
		case "+":
			Add add = new Add();
			add.setValue(a,b);
			answer = add.calculate();
			break;
			
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			answer = sub.calculate();
			break;
			
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			answer = mul.calculate();
			break;
			
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			answer = div.calculate();
			break;
			
			default:
				System.out.println("연산자 입력이 잘못되었습니다.");
				break;
		
	}
		System.out.println(answer);

}
}
