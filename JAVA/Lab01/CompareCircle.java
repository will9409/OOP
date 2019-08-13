import java.util.Scanner;

public class CompareCircle {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>> ");
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		int r1 = a.nextInt();
		System.out.print("두번째 원의 중심과 반지름 입력>> ");
		int x2 = a.nextInt();
		int y2 = a.nextInt();
		int r2 = a.nextInt();
		
		int b = 0;
		b = (x1-x2)+(y1-y2);
		if(Math.abs(r1+r2) > Math.abs(b)) {
			System.out.println("두 원은 서로 겹친다."); // 맞닿은곳은 겹치지 않는다고 간주합니다
		}
		
		
	}

}
