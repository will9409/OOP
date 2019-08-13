
public class OverridingApplicate {
	public static void main(String [] args) {
		DObject start, n, obj;

		// 링크드 리스트로 도형 생성하여 연결하기
		start = new Line(); //Line 객체 연결
		n = start;
		obj = new Rect(); 
		n.next = obj; //Rect객체 연결
		n = obj;
		obj = new Line(); // Line 객체 연결
		n.next = obj;
		n = obj;
		obj = new Circle(); // Circle 객체 연결
		n.next = obj;

		// 모든 도형 출력하기
		while(start != null) {
			start.draw();
			start = start.next;
		}
	}
}
