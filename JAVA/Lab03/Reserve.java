import java.util.Scanner;

public class Reserve extends Seat {

	static int pnum;
	
	public static void Reserv(int b , String c) {
		if(snum[b] != "Notreserved") {
			System.out.println("자리가 이미 예약되어있습니다.");
			System.out.println("다시 시도해주세요.");
		}
		else {
			snum[b] = c;
			System.out.println("예약되었습니다");
		}
	}
	public static void Search() {
		System.out.println("          스테이지                       ");
		System.out.println("*****S(1)S(2)S(3)S(4)*****");
		System.out.println("*****A(5)A(6)A(7)A(8)*****");
		System.out.println("*********B(9)B(10)*********");
	}
	public static void Cancel(String s) {
		int r = 0;
		for(int i = 0 ; i < snum.length;i++) {
			if(s.equals(snum[i])) {
				snum[i] = "Notreserved";
				System.out.println("신청하셨던 "+i+"번 자리 신청이 취소되었습니다.");
				r = 1;
				}
		}
		if(r == 0) {
			System.out.println(s+" 이름으로 입력된 취소할 자리가 없습니다.");
		}
		if(r == 1) {
			r = 0;
		}
	}
	public static void Quit(int n) {
		pnum = n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeatType[] nSeattype;
		nSeattype = new SeatType[10];
		for(int i = 0; i < nSeattype.length;i++) {
			nSeattype[i] = new SeatType();
		}
		nSeattype[0].stype = "S";nSeattype[1].stype = "S";nSeattype[2].stype = "S";
		nSeattype[3].stype = "S";nSeattype[4].stype = "A";nSeattype[5].stype = "A";
		nSeattype[6].stype = "A";nSeattype[7].stype = "A";nSeattype[8].stype = "B";
		nSeattype[9].stype = "B";
		
		Scanner w = new Scanner(System.in);
		while(pnum == 0) {
			
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 예약  2. 조회  3. 취소  4. 끝내기");
		int n = w.nextInt();
		switch(n) {
		case 1:
			System.out.print("좌석타입,예약자이름,좌석번호를 순서대로 입력하세요 :");
			String j = w.next();
			String k = w.next();
			int l = w.nextInt();
			System.out.println("좌석타입 :"+j+" 예약자 이름 :"+k+" 좌석번호 :"+l);
			if(j.equals(nSeattype[l-1].stype)) {
				Reserv(l,k);
				break;
			}
			else
				System.out.println("다른 좌석타입입니다. 다시 시도하세요.");
			break;
		case 2:
			Search();
			break;
		case 3:
			System.out.print("취소하실 분의 성함을 다시 입력해주세요 : ");
			String p = w.next();
			Cancel(p);
			break;
		case 4:
			System.out.println("정말 끝내시겠습니까?");
			System.out.println("1.예   2. 아니오");
			
			int x = w.nextInt();
			if(x == 1 || x == 2) {Quit(x);}
			else
				System.out.println("입력범위가 올바르지 않습니다.");
				
			break;
		default:
			System.out.println("입력범위가 바르지 않습니다. 다시 시도하세요.");
			break;
			
		}
	}
	}

}
