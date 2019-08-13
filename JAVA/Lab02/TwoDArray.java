import java.util.Random;
public class TwoDArray {
	

	private static int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnum = new Random();
		
		
		int[][] a = new int[4][4];
		int b = 8;
		for(int i = 0; i < a.length;i++) {
			for(int j = 0; j<a.length;j++) {
				if(rnum.nextBoolean() && b >0 && a[i][j] == 0) {
					b--;
					do {
						a[i][j]= rnum.nextInt(11);
					}while(a[i][j] == 0);
				}
				if(b > 0 && (i==a.length-1 && j == a.length-1)) {
					i = 0;
					j = 0;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j <a.length; j++) {
				if(j == a.length-1) {
					System.out.println(a[i][j]);
				}
				else {
					System.out.print(a[i][j]+"  ");
				}
			}
		}
	}

}
