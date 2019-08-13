import java.util.Scanner;
public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		int q[] = new int[5];
		int r = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			q[i] = a.nextInt();
			if(r<q[i]) {
				r =q[i];
			}
			
		}
		System.out.println("입력된 가장 큰 수는 "+r+"입니다.");
	}

}
