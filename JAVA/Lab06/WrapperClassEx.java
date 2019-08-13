
public class WrapperClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(10);
		char c = '4';
		Double d = new Double(3.1234566);
		
		System.out.println(Character.toLowerCase('A')); //a
		if (Character.isDigit(c)) 
			System.out.println(Character.getNumericValue(c)); // 4
		System.out.println(Integer.parseInt("-123")); // -123
		
		System.out.println(Integer.toHexString(28)); // 16
		
		System.out.println(Integer.toBinaryString(28)); // 11100
		
		System.out.println(i.doubleValue()); // 3 1c 10.0
		
		System.out.println(d.toString()); // 3.1234566
		
		System.out.println(Double.parseDouble ("44.13e-6")); //4.413E-5
	}

}
