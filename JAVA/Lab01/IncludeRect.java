import java.util.Scanner;

public class IncludeRect {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("x1, y1값을 띄어쓰기하여 순서대로 입력하세요");
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		// 실습6번에서 (100,100),(200,200)은 왼쪽 하단 모서리와 오른쪽 상단 모서리인데,문제에서 잘못 쓰인 것 같습니다.
		
		int rectangle[][] = new int[201][201] ;
		
		for(int x = 100;x<201;x++) {
			for(int y = 100;y<201;y++) {
				rectangle[x][y] = 1;
			}
		}
		if(x1 >200 || y1 > 200 || x1 < 100 || y1 <100) {
			System.out.println("(x,y)가 직사각형 밖에 있습니다.");
		}
		else if (rectangle[x1][y1] == 1) { // 배열 밖이면 무조건 직사각형 밖이라고 여기면 되지만, 내부적 확인차원에서 한번더 확인합니다
				System.out.println("(x,y)가 직사각형 안에 있습니다.");
			}
	}
}