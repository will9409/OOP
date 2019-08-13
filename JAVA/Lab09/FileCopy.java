import java.io.*;
public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileInputStream in = null;
		BufferedInputStream bin = null;
		BufferedOutputStream bwriter = null;
		FileOutputStream out = null;
		
		
		try {
			in = new FileInputStream("C:\\Temp\\a.jpg");
			bin = new BufferedInputStream(in,1000);
			out = new FileOutputStream("C:\\Temp\\b.jpg");
			bwriter = new BufferedOutputStream(out,1000);
			
			int c;
			while((c = in.read()) != -1) {
				bwriter.write(c);
			}
			
			
			in.close();
			bin.close();
			out.close();
			
		}catch(IOException e){
			System.out.println("파일 복사 오류");
		}
		
	}

}
