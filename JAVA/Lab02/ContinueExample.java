
public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		
		for(int i = 0; i < 101;i++) {
			if(i%2!=0) {
				continue;
			}
			a += i;
		}
		System.out.println("1���� 100���� ¦���� ���� "+a);

	}

}
