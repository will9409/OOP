
public class MemberAccessExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		B b = new B();
		
		a.p = 5;
		//a.n = 5; // not visible
		
		b.p = 5;
		//b.n = 5; // not visible
		b.setN(10);
		int i = b.getN();
		
		//b.m = 20; // not visible
		b.setM(20);
		System.out.println(b.toString());
	}

}
