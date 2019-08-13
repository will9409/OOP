import java.util.Scanner;
public class DicManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		
		while(true) {
			System.out.print("한글 단어?");
			String q = "Ready";
		String a = s.next();
		q = Dictionary.kor2Eng(a);
		
		if(a.equals("그만")) {
			return;
			}
		else if(q.equals("NotExist")) {
			System.out.println(a+"는 저의 사전에 없습니다.");
			}
		else
			System.out.println(a+"는 "+q);
		}
	}

}
