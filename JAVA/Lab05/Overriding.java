
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professorr s = new Professorr();
		s.setPhone("011-123-1234");
		System.out.println(s.getPhone());
		Personn p = s;
		System.out.println(p.getPhone());
	}

}
