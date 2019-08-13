import java.io.*;
public class FileReadHangulSuccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fin = new FileInputStream("C:\\Temp\\hangul.txt");
			InputStreamReader in = new InputStreamReader(fin, "MS949");
			
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
