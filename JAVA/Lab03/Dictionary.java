
public class Dictionary {

	private static String[] kor = {"»ç¶û","¾Æ±â","µ·","¹Ì·¡","Èñ¸Á"};
	private static String[] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		int q = -1;
		for(int i = 0;i < kor.length;i++) {
			if(kor[i].equals(word)) {
				 q = i;
			}
		}
		if(q == -1) {
			return "NotExist";
		}
		else
			return eng[q];
	}
	
	public Dictionary() {
		
	}

}
