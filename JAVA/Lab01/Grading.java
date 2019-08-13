import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		while(a.hasNext()) { 
			int ccredit = a.nextInt();
			if(ccredit >= 90) {
				System.out.println("학점은 A입니다");
			}
			else if (ccredit < 90 && ccredit >= 80) {
				System.out.println("학점은 B입니다");
			}
			else if (ccredit < 80 && ccredit >= 70) {
				System.out.println("학점은 C입니다");
			}
			else if (ccredit < 70 && ccredit >= 60) {
				System.out.println("학점은 D입니다");
			}
			else
				System.out.println("학점은 F입니다");
	}
	}

}
