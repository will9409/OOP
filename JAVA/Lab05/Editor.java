import java.util.Scanner;

public class Editor {

	public static void main(String[] args) {
		// tODO Auto-generated method stub

		DObject1 start= new Header(), n= new Header(), obj= new Header(),
				temp= new Header(),temp2 = new Header();
		int r = 0;
		int s = 0;
		int u = 0;
		DObject1 init = null;
		while(r !=4) {
		Scanner a = new Scanner(System.in);
		System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
		int q = a.nextInt();
		//DObject1 header = new Header();
		switch(q) {
		case 1:
					System.out.print("도형종류 Line(1), Rect(2), Circle(3)");
					int t = a.nextInt();
					switch(t) {
					case 1:
						if(s == 0) {
							init = new Line1();
							start = new Line1();
							n = start;
							s++;
						}
						else {
							obj = new Line1();
							n.next = obj;
							n = obj;
							n.next = start;
							s++;
						}
						break;
					case 2:
						if(s == 0) {
							init = new Rect1();
							start = new Rect1();
							n = start;
							s++;
						}
						else {
							obj = new Rect1();
							n.next = obj;
							n = obj;
							n.next = start;
							s++;
						}
						break;
					case 3:
						if(s == 0) {
							init = new Circle1();
							start = new Circle1();
							n = start;
							n.next = start;
							s++;
						}
						else {
							obj = new Circle1();
							n.next = obj;
							n = obj;
							n.next = start;
							s++;
						}
						break;
					default:
						return;
				}
				break;
		case 2:
				System.out.println("삭제할 도형의 순서를 입력하세요");
				int v = a.nextInt();
				if(v > s) {
					return;
				}
				if(v == 1) {
					for(int i = 1; i<= s;i++) {
						start = start.next;
					}
					start.next = start.next.next;
				}
				else {
				for(int i = 1; i < v+1; i++) {
					if(i == v-1) {
						start.next = start.next.next;
						break;
					}
					start = start.next;
				}
				}
				s = s-1;
				
			break;
		case 3:
			int w = s;
			while(s > 0) {
				start.draw();
				start = start.next;
				s--;
			}
			s = w;
			break;
		case 4:
			r = 4;
			break;
		default:return;
		}
		
		}
		
	}

}
