class A{
	public A() {
		System.out.println("������A");
	}
	public A(int x) {
		System.out.println("������A");
	}
}
class B extends A {
	public B() {
		System.out.println("������B");
	}
	public B(int X) {
		super(X);
		System.out.println("�Ű�����������B" + X);
	}
}
public class ConstructorEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b;
		b = new B(5);
	}

}
