import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner a = new Scanner(System.in);
		int q[] = new int [10];
		for (int i = 0; i < q.length ; i ++) {
			q[i] = a.nextInt();
		}
		int temp = 0;
		for(int i = q.length; i>0; i--) {
			for(int j = 0; j < i-1; j ++) {
	
			if(q[j]>q[j+1]) {
				temp = q[j];
				q[j] = q[j+1];
				q[j+1] = temp;
			}
			}
		}
		for(int i = 0; i < q.length;i++) {
			System.out.println(q[i]);
		}
		
	}

}
