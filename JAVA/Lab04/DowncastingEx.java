
public class DowncastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Student("���繮");
		Student s;
		
		s = (Student)p;
		
		System.out.println(s.name);
		s.grade = "A";
	}

}
