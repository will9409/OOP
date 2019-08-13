class CurrencyConverter{
	private static double rate;
	
	public static void setRate(int a) {
		rate = a;
	}
	
	public static double toDollar(double b) {
		return b/rate;
	}
	public static double toKWR(double b) {
		return b*rate;
	}
}

public class StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CurrencyConverter.setRate(1121); //�̱� �޷� ȯ�� ����
		System.out.println("�鸸���� " +CurrencyConverter.toDollar(1000000)+"�޷��Դϴ�.");
		System.out.println("��޷��� " +CurrencyConverter.toKWR(100)+"���Դϴ�.");
	}

}
