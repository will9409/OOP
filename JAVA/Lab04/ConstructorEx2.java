class A{
	/*public A() {
		System.out.println("������A");
	}*/
	public A(int x) {
		System.out.println("������A");
	}
}
class B extends A {
	public B() {
		System.out.println("������B");
	}
}
public class ConstructorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b;
		b = new B();
	}

}
