import java.util.Scanner;
public class PhoneBook {

	public void search(String n) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		
		
		System.out.print("�ο���>>");
		int n = s.nextInt();
		Phone[] p = new Phone[n];
		for(int i = 0; i < n; i ++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȭ��ȣ�� �� ĭ���� �Է�)>>");
			String a = s.next();
			String b = s.next();
			p[i] = new Phone(a,b);
			
		}
		System.out.println("����Ǿ����ϴ�.");
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String d = s.next();
			if(d.equals("�׸�")) {
				return ;
			}
			int r = 0;
			int t = 0;
			for(int i = 0; i < p.length;i++) {
				if(p[i].getPn().equals(d)) {
					System.out.println(d+"�� ��ȣ�� "+p[i].getTel()+"�Դϴ�.");
					t++;
				}
				else
					r++;
			}
			if(r != 0 && t == 0) {
				System.out.println(d+" �� �����ϴ�.");
			}

			
		}
		
	}

}
