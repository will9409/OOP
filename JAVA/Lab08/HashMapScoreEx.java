import java.util.*;
public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> javaScore = new HashMap<String,Integer>();
		//5개의 점수 저장
		javaScore.put("한홍진", 97);
		javaScore.put("황기태", 34); 
		javaScore.put("이영희", 98);
		javaScore.put("정원석", 70);		
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 :"+javaScore.size());
		// 모든 사람의 점수 출력. 
		System.out.println("모든 사람의 점수 출력");
		Set<String> keys = javaScore.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = javaScore.get(key);
			System.out.println(value);
		}
		
		// javaScore에 들어 있는 모든 (key, value) 쌍 출력
		System.out.println("javaScore에 들어있는 모든 (key, value) 쌍 출력");
		Set<String> keys1 = javaScore.keySet();
		Iterator<String> it1 = keys1.iterator();
		while(it1.hasNext()) {
			String key1 = it1.next();
			Integer value1 = javaScore.get(key1);
			System.out.println("("+key1+","+value1+")");
		}
		
		// key 문자열을 가진 집합 Set 컬렉션 리턴
		System.out.println("key 문자열을 가진 집합 Set 컬렉션 리턴");
		System.out.println(javaScore.keySet());
		// key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		System.out.println("key 문자열을 순서대로 접근할 수 있는 Iterator 리턴");
		System.out.println(keys1.iterator());
	}

}
