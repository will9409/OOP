
public class OverridingApplicate {
	public static void main(String [] args) {
		DObject start, n, obj;

		// ��ũ�� ����Ʈ�� ���� �����Ͽ� �����ϱ�
		start = new Line(); //Line ��ü ����
		n = start;
		obj = new Rect(); 
		n.next = obj; //Rect��ü ����
		n = obj;
		obj = new Line(); // Line ��ü ����
		n.next = obj;
		n = obj;
		obj = new Circle(); // Circle ��ü ����
		n.next = obj;

		// ��� ���� ����ϱ�
		while(start != null) {
			start.draw();
			start = start.next;
		}
	}
}
