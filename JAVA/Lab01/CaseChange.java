import java.util.Scanner;
public class Casechanger {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		String letter = a.next();
		
		char c = letter.charAt(0);
		if(c >= 65 && c <= 90) {
			letter = String.valueOf(c).toLowerCase();
			System.out.println(letter);
		}
		else if(c >= 97 && c <= 122) {
			letter = String.valueOf(c).toUpperCase();
			System.out.println(letter);
		}
		else
			System.out.println("¿µ¹®ÀÚ°¡ ŸÆŽÕŽÏŽÙ.");

	}

}
