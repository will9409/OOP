import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double q[] = new double[5];
		Scanner a = new Scanner(System.in);
		double b = 0;
		
		for(int i = 0 ; i < q.length;i++) {
			q[i] = a.nextInt();
			b += q[i];
		}
		b = b/q.length;
		System.out.println("배열 원소의 평균은 "+b+"입니다.");
	}

}
