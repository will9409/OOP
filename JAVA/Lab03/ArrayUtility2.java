
public class ArrayUtility2 {
	static int[] concat (int[] s1, int[] s2) {
		
		int[] s3 = new int[s1.length+s2.length];
		int j = 0;
		for (int i = 0; i <s3.length;i++) {
			if(i<s1.length)
			{
				s3[i] = s1[i];	
			}
			else {
				s3[i] = s2[j];
				j++;
			}
		}
		return s3;
	}
	
	
	static int[] remove (int[] s1, int[] s2) {
		
		int[] c = new int[s1.length-s2.length];
		for (int i = 0; i < s1.length-s2.length; i++) {
			c[i] = s1[i];
			
		}
		return c;
	}
	
	public ArrayUtility2() {
		
	}
	
}
