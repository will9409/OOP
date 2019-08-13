
public class StringStack implements Stack{
	static String string = "";
	Object stackpoint;
	Object n;
	int r = 0;
	public int length() {
		return r;
	}
	public Object pop() {
		if(this.length() != 0) {
			if(r == 1) {
				stackpoint = stackpoint.upper;
			}
			else {
			for(int i = 1; i < r; i++) {
				stackpoint = stackpoint.upper;
			}
			}
		}
		System.out.println(this.string.length());
		System.out.println(stackpoint.string.length());
		this.string = this.string.substring(0,this.string.length()-stackpoint.string.length());
		for(int i = 1; i < r; i++) {
			stackpoint = stackpoint.upper;
		}
			for(int i = 1; i < r; i++) {
				stackpoint = stackpoint.upper;
			}
		r--;
		return stackpoint;
	}
	public Boolean push(Object ob) {
		if(this.length() == 0) {
			stackpoint = ob;
			n = stackpoint;
			n.upper = stackpoint;
			this.r++;
		}
		else{
			n.upper = ob;
			n = ob;
			n.upper = stackpoint;
			r++;
		}
		StringStack.string += ob.string;
		this.r++;
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringStack s = new StringStack();
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		a.string = "hello";
		b.string = "my";
		c.string = "name is wooil";
		System.out.println("Stack : "+s.string);
		s.push(a);
		System.out.println("Stack : "+s.string);
		s.push(b);
		System.out.println("Stack : "+s.string);
		s.push(c);
		System.out.println("Stack : "+s.string);
		s.pop();
		System.out.println("Stack : "+s.string);
		s.pop();
		System.out.println("Stack : "+s.string);
		s.pop();
		System.out.println("Stack : "+s.string);
	}


}
