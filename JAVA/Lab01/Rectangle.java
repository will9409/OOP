import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("x1, y1, x2, y2���� �����Ͽ� ������� �Է��ϼ���");
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		int x2 = a.nextInt();
		int y2 = a.nextInt();
		
		int rectangle[][] = new int[150][150] ;
		
		for(int x = 50;x<101;x++) {
			for(int y = 50;y<101;y++) {
				rectangle[x][y] = 1;
			}
		}
		if(x1<x2 && y1<y2) {
			for(int i = x1;i<x2+1;i++) {
				for(int j = y1;j<y2+1;j++) {
					if (rectangle[i][j] == 1) {
						System.out.println("�浹�� �߻��մϴ�");
						return;
					}
				}
			}
		}

	}

}