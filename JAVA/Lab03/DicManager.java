import java.util.Scanner;
public class DicManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String q = "Ready";
		String a = s.next();
		q = Dictionary.kor2Eng(a);
		
		if(a.equals("�׸�")) {
			return;
			}
		else if(q.equals("NotExist")) {
			System.out.println(a+"�� ���� ������ �����ϴ�.");
			}
		else
			System.out.println(a+"�� "+q);
		}
	}

}
