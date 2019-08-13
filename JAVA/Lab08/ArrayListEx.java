import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		ArrayList<String> p = new ArrayList<String>();
		
		String[] a = new String[4];
		int q = 0;
		for(int i = 0; i < a.length; i++) {
			System.out.print("ÀÌž§À» ÀÔ·ÂÇÏŒŒ¿ä>>");
			a[i] = s.next();
		}
		for(int i = 0; i< a.length;i++) {
			if(i == 3) {
				System.out.println(a[i]+" ");
			}
			else
			System.out.print(a[i]+" ");
		}
		for(int i = 0; i< a.length-1;i++) {
			if(a[i].length()>a[i+1].length()) {
				q = i;
			}
		}
		System.out.println("°¡Àå ±ä ÀÌž§Àº: "+a[q]);
	}

}
