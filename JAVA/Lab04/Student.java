
public class Student extends Person{


	void set() {
		this.age = 25;
		this.name = "����";
		this.height = 170;
		setWeight(70);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.set();
	}

}
