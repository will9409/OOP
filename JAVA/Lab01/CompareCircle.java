import java.util.Scanner;

public class CompareCircle {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>> ");
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		int r1 = a.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>> ");
		int x2 = a.nextInt();
		int y2 = a.nextInt();
		int r2 = a.nextInt();
		
		int b = 0;
		b = (x1-x2)+(y1-y2);
		if(Math.abs(r1+r2) > Math.abs(b)) {
			System.out.println("�� ���� ���� ��ģ��."); // �´������� ��ġ�� �ʴ´ٰ� �����մϴ�
		}
		
		
	}

}
