
public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		// ���ڿ� �����̱�
		sb.append(" is pencil");
		System.out.println(sb);

		// ���ڿ� ��my�� ����
		sb.insert(7, " my");
		System.out.println(sb);

		// ���ڿ� ��my���� ��your���� ��ġ
		sb.replace(7, 10, " your");
		System.out.println(sb);

		// ��Ʈ�� ���� �� ���ڿ� ���� ����
		sb.setLength(4);
		System.out.println(sb);

		System.out.println(sb.hashCode());
	}

}
