class A{
	public A() {
		System.out.println("������A");
	}
}
class B extends A {
	public B() {
		System.out.println("������B");
	}
}
class C extends B {
	public C() {
		System.out.println("������C");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c;
		c = new C();
	}

}