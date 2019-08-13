import java.io.*;

public class FileCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		BufferedInputStream bin = null;
		BufferedOutputStream bwriter = null;
		FileOutputStream out = null;
		
		File a = new File("C:\\Temp\\a.jpg");
		Long l = a.length();
		Long b = (long)0.0;
		double d = (long)0.0;
		
		try {
			in = new FileInputStream("C:\\Temp\\a.jpg");
			bin = new BufferedInputStream(in,1000);
			out = new FileOutputStream("C:\\Temp\\b.jpg");
			bwriter = new BufferedOutputStream(out,1000);
			d = 0.1;
			int c;
			while((c = in.read()) != -1) {
				bwriter.write(c);
				b +=(long)1;
				//System.out.println(d);
				//System.out.println(b);
				//System.out.println(l);
				if(b>=l*d) {
					System.out.print("*");
					d +=0.1; 
				}
			}
			
			in.close();
			bin.close();
			out.close();
			
		}catch(IOException e){
			System.out.println("파일 복사 오류");
		}
	}

}
