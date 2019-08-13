import java.util.*;
public class MyStack1<T> implements Stack<T> {
	LinkedList<T> list = new LinkedList<T>();
	int i = 0;
	@Override
	public T pop() {
		if(i == 0) {
			return null;
		}
		i = i - 1;
		return (T)list.get(i);
	}

	@Override
	public boolean push(T ob) {

		i = i+1;
		list.add(ob);
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack1<Integer> st = new MyStack1<Integer>();
		st.push(1);
		st.push(3);
		st.push(5);
		st.push(9);
		for(int i = 0;i<4;i++) {
			System.out.println(st.pop());
		}
		
	}

}
