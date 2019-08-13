import java.util.Scanner;
public class PhoneBook {

	public void search(String n) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		
		
		System.out.print("인원수>>");
		int n = s.nextInt();
		Phone[] p = new Phone[n];
		for(int i = 0; i < n; i ++) {
			System.out.print("이름과 전화번호(이름과 전화번호는 빈 칸없이 입력)>>");
			String a = s.next();
			String b = s.next();
			p[i] = new Phone(a,b);
			
		}
		System.out.println("저장되었습니다.");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String d = s.next();
			if(d.equals("그만")) {
				return ;
			}
			int r = 0;
			int t = 0;
			for(int i = 0; i < p.length;i++) {
				if(p[i].getPn().equals(d)) {
					System.out.println(d+"의 번호는 "+p[i].getTel()+"입니다.");
					t++;
				}
				else
					r++;
			}
			if(r != 0 && t == 0) {
				System.out.println(d+" 이 없습니다.");
			}

			
		}
		
	}

}
