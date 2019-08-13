
public class Add {

	public static boolean isStringInt(String s){
		try {
			Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[args.length];
		for(int i = 0; i < args.length; i++){
			if(isStringInt(args[i])) {
				a[i] = Integer.parseInt(args[i]);
			}
		}
		int b = 0;
		for(int i = 0; i < args.length; i++) {
				 b += a[i];
		}
		System.out.println(b);
		
	}

}
