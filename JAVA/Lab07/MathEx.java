import java.lang.Math;
public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = -2.78987434;
		System.out.println(Math.abs(a));
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println(Math.sqrt(Math.rint(Math.round(Math.abs(a))*3)));
		System.out.println(Math.exp(1.5));
		System.out.println(Math.rint(Math.round(Math.abs(a))));
		
		System.out.print("�̹��� ����� ��ȣ�� ");
		for(int i = 0; i < 5; i++ ) {
			double d = Math.random()*45;
			int n = (int)(Math.round(d));
			System.out.print(n+" ");
		}
		
	}

}
