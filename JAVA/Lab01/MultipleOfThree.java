import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.print("���� �Է��Ͻÿ�: ");
	int number = a.nextInt();
	if (number%3 == 0) {
		System.out.print("3�� ����Դϴ�.");
	}
	else
		System.out.print("3�� ����� �ƴմϴ�.");
	}

}
