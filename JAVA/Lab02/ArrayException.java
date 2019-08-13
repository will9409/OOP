
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[5];
		try {
			for (int i = 0; i < 5 ; i++) {
				intArray[i+1] = i+1 + intArray[i];
				System.out.println("intArray[0] = "+intArray[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("¹è¿­ÀÇ ÀÎµ¦½º°¡ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
			}
		}
}

