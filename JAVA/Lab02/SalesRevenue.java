
public class SalesRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0, b = 0, c = 0;
		double intArray[][] = {{ 90,  90, 110, 110},
							{120, 110, 100, 110},
							{120, 140, 130, 150}};
	
	for(int i = 0; i < intArray.length; i ++) {
		for(int j = 0; j < intArray[i].length; j ++) {
			a += intArray[i][j];
		}
	}
	System.out.println("���� 3�Ⱓ ���� �Ѿ��� "+a+"�̸� ����� ������ "+a/intArray.length+"�Դϴ�.");
}
}