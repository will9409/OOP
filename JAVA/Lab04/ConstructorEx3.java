class A{
	public A() {
		System.out.println("持失切A");
	}
	public A(int x) {
		System.out.println("持失切A");
	}
}
class B extends A {
	public B() {
		System.out.println("持失切B");
	}
	public B(int x) {
		System.out.println("古鯵痕呪持失切B");
	}
}
public class ConstructorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b;
		b = new B();
	}

}
