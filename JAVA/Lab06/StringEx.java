
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" abcd");
		String b = new String(",efg");

		// ���ڿ� ����
		a = a.concat(b);
		System.out.println(a);

		// ���� ����
		a = a.trim();
		System.out.println(a);
		// ���ڿ� ��ġ
		a = a.replace("ab", "12");

		// ���ڿ� �и�
		String[] s = a.split(",");
		for(int i = 0 ; i < s.length;i++) {
			System.out.println("�и��� "+ i +"�� ���ڿ�: "+s[i]);
		}
		// ���� ��Ʈ��
		a = a.substring(3);
		System.out.println(a);
		// ���ڿ��� ����
		
		System.out.println(a.charAt(2));
	}

}
