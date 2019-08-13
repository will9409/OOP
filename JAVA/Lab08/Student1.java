import java.util.*;

public class Student1 {

	String name;
	String dept;
	String id;
	double average;
	
	public Student1(String name,String dept,String id,double average) {
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.average = average;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Student1[] p = new Student1[5];
		
		for(int i = 0; i <p.length;i++ ) { 
			System.out.println("�л��� �̸�,�а�,�й�,����� �Է��ϼ���: ");
			String ntemp = s.next();
			String dtemp = s.next();
			String itemp = s.next();
			double atemp = s.nextDouble();
			p[i] = new Student1(ntemp,dtemp,itemp,atemp);
		}
		
		Hashtable<String,Student1> table = new Hashtable<String,Student1>();
		for(int i = 0; i < p.length;i++) {
		table.put(p[i].id, p[i]);
		}
		
		Set<String> keys4 = table.keySet();
		Iterator<String> it3 = keys4.iterator();
		while(it3.hasNext()) {
			String key3 = it3.next();
			Student1 value2 = table.get(key3);
			System.out.println("�̸�: "+value2.name+" �а�: "+value2.dept+" �й�: "+value2.id+" ���: "+value2.average);
		}
	}
	
	
}
