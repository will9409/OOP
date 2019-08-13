import java.util.*;
public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> javaScore = new HashMap<String,Integer>();
		//5���� ���� ����
		javaScore.put("��ȫ��", 97);
		javaScore.put("Ȳ����", 34); 
		javaScore.put("�̿���", 98);
		javaScore.put("������", 70);		
		javaScore.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ���� :"+javaScore.size());
		// ��� ����� ���� ���. 
		System.out.println("��� ����� ���� ���");
		Set<String> keys = javaScore.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = javaScore.get(key);
			System.out.println(value);
		}
		
		// javaScore�� ��� �ִ� ��� (key, value) �� ���
		System.out.println("javaScore�� ����ִ� ��� (key, value) �� ���");
		Set<String> keys1 = javaScore.keySet();
		Iterator<String> it1 = keys1.iterator();
		while(it1.hasNext()) {
			String key1 = it1.next();
			Integer value1 = javaScore.get(key1);
			System.out.println("("+key1+","+value1+")");
		}
		
		// key ���ڿ��� ���� ���� Set �÷��� ����
		System.out.println("key ���ڿ��� ���� ���� Set �÷��� ����");
		System.out.println(javaScore.keySet());
		// key ���ڿ��� ������� ������ �� �ִ� Iterator ����
		System.out.println("key ���ڿ��� ������� ������ �� �ִ� Iterator ����");
		System.out.println(keys1.iterator());
	}

}
