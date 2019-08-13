import java.io.*;
public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStreamReader in = new InputStreamReader(System.in);
				
				FileWriter fout =null;
		
		int c;
		try {
			fout = new FileWriter("C:\\Temp\\test.txt");
			while((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
