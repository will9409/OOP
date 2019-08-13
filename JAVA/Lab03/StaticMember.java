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

		CurrencyConverter.setRate(1121); //미국 달러 환율 설정
		System.out.println("백만원은 " +CurrencyConverter.toDollar(1000000)+"달러입니다.");
		System.out.println("백달러는 " +CurrencyConverter.toKWR(100)+"원입니다.");
	}

}
