
public class MainParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 0;
		for(int i = 0; i < args.length; i++) {
			a += Double.parseDouble(args[i]);
		}
		System.out.println("�հ� :"+a);
		System.out.println("��� :"+a/args.length);

	}

}
