import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		while(a.hasNext()) { 
			int ccredit = a.nextInt();
			if(ccredit >= 90) {
				System.out.println("������ A�Դϴ�");
			}
			else if (ccredit < 90 && ccredit >= 80) {
				System.out.println("������ B�Դϴ�");
			}
			else if (ccredit < 80 && ccredit >= 70) {
				System.out.println("������ C�Դϴ�");
			}
			else if (ccredit < 70 && ccredit >= 60) {
				System.out.println("������ D�Դϴ�");
			}
			else
				System.out.println("������ F�Դϴ�");
	}
	}

}
