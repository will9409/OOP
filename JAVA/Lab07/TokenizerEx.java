import java.util.StringTokenizer;

public class TokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
	}
	}

}
