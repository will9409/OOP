import java.util.Scanner;

public class Reserve extends Seat {

	static int pnum;
	
	public static void Reserv(int b , String c) {
		if(snum[b] != "Notreserved") {
			System.out.println("�ڸ��� �̹� ����Ǿ��ֽ��ϴ�.");
			System.out.println("�ٽ� �õ����ּ���.");
		}
		else {
			snum[b] = c;
			System.out.println("����Ǿ����ϴ�");
		}
	}
	public static void Search() {
		System.out.println("          ��������                       ");
		System.out.println("*****S(1)S(2)S(3)S(4)*****");
		System.out.println("*****A(5)A(6)A(7)A(8)*****");
		System.out.println("*********B(9)B(10)*********");
	}
	public static void Cancel(String s) {
		int r = 0;
		for(int i = 0 ; i < snum.length;i++) {
			if(s.equals(snum[i])) {
				snum[i] = "Notreserved";
				System.out.println("��û�ϼ̴� "+i+"�� �ڸ� ��û�� ��ҵǾ����ϴ�.");
				r = 1;
				}
		}
		if(r == 0) {
			System.out.println(s+" �̸����� �Էµ� ����� �ڸ��� �����ϴ�.");
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
			
		System.out.println("������ �Ͻðڽ��ϱ�?");
		System.out.println("1. ����  2. ��ȸ  3. ���  4. ������");
		int n = w.nextInt();
		switch(n) {
		case 1:
			System.out.print("�¼�Ÿ��,�������̸�,�¼���ȣ�� ������� �Է��ϼ��� :");
			String j = w.next();
			String k = w.next();
			int l = w.nextInt();
			System.out.println("�¼�Ÿ�� :"+j+" ������ �̸� :"+k+" �¼���ȣ :"+l);
			if(j.equals(nSeattype[l-1].stype)) {
				Reserv(l,k);
				break;
			}
			else
				System.out.println("�ٸ� �¼�Ÿ���Դϴ�. �ٽ� �õ��ϼ���.");
			break;
		case 2:
			Search();
			break;
		case 3:
			System.out.print("����Ͻ� ���� ������ �ٽ� �Է����ּ��� : ");
			String p = w.next();
			Cancel(p);
			break;
		case 4:
			System.out.println("���� �����ðڽ��ϱ�?");
			System.out.println("1.��   2. �ƴϿ�");
			
			int x = w.nextInt();
			if(x == 1 || x == 2) {Quit(x);}
			else
				System.out.println("�Է¹����� �ùٸ��� �ʽ��ϴ�.");
				
			break;
		default:
			System.out.println("�Է¹����� �ٸ��� �ʽ��ϴ�. �ٽ� �õ��ϼ���.");
			break;
			
		}
	}
	}

}
