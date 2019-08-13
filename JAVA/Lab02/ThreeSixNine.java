
public class ThreeSixNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		for(int i = 0; i < 100;i++) {
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				a++;
			}
			if((i-(i%10))/10 == 3 || (i-(i%10))/10 == 6 || (i-(i%10))/10 == 9) {
				a++;
			}
			if(a == 1) {
				System.out.println(+i+" 박수 한번");
				a = 0;
			}
			if(a == 2) {
				System.out.println(+i+" 박수 두번");
				a = 0;
			}
		}
	}

}
