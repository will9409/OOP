import java.util.Scanner;

public class IncludeRect {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("x1, y1���� �����Ͽ� ������� �Է��ϼ���");
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		// �ǽ�6������ (100,100),(200,200)�� ���� �ϴ� �𼭸��� ������ ��� �𼭸��ε�,�������� �߸� ���� �� �����ϴ�.
		
		int rectangle[][] = new int[201][201] ;
		
		for(int x = 100;x<201;x++) {
			for(int y = 100;y<201;y++) {
				rectangle[x][y] = 1;
			}
		}
		if(x1 >200 || y1 > 200 || x1 < 100 || y1 <100) {
			System.out.println("(x,y)�� ���簢�� �ۿ� �ֽ��ϴ�.");
		}
		else if (rectangle[x1][y1] == 1) { // �迭 ���̸� ������ ���簢�� ���̶�� ����� ������, ������ Ȯ���������� �ѹ��� Ȯ���մϴ�
				System.out.println("(x,y)�� ���簢�� �ȿ� �ֽ��ϴ�.");
			}
	}
}