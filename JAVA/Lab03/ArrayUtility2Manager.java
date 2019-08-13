
public class ArrayUtility2Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = new int[10];
		for(int i = 0 ; i < a.length; i++) {
			a[i] = i;
		}
		int[] b = new int[10];
		for(int i = 0 ; i < b.length; i++) {
			b[i] = i;
		}
		int[] c = new int[a.length+b.length];
		System.out.print("a = ");
		for(int i = 0 ; i < a.length; i++) {
			if(i == a.length-1) {
				System.out.println(a[i]+" ");
			}
			else
			System.out.print(a[i]+" ");
		}
		System.out.print("b = ");
		for(int i = 0 ; i < b.length; i++) {
			if(i == b.length-1) {
				System.out.println(b[i]+" ");
			}
			else
			System.out.print(b[i]+" ");
		}
		c = ArrayUtility2.concat(a,b);
		System.out.println("after concat");
		for(int i = 0 ; i < c.length; i++) {
			if(i == c.length-1) {
				System.out.println(c[i]+" ");
			}
			else
			System.out.print(c[i]+" ");
		}
		c = ArrayUtility2.remove(c, b);
		System.out.println("after remove");
		for(int i = 0 ; i < c.length; i++) {
			if(i == c.length-1) {
				System.out.println(c[i]+" ");
			}
			else
			System.out.print(c[i]+" ");
		}
	}

}
