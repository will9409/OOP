import java.util.Vector;
public class PointVectorEx {
	public static void main(String[] args) {
		// Point ��ü�� ��ҷθ� ������ ���� ����
		Vector<Point> v = new Vector<Point>(); 
		
		// 3 ���� Point ��ü ���� 
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));

		// ���Ϳ� �ִ� Point ��ü ��� �˻��Ͽ� ���
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); // ���Ϳ��� i ��° Point ��ü ����
			System.out.println(p); // p.toString()�� �̿��Ͽ� ��ü p ���
		}
	}
}