import java.io.*;
import java.util.Scanner;
public class TextCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("복사할 파일 이름: ");
		String a = s.next();
		
		
		FileReader in = null;
		BufferedReader breader = null;
		BufferedWriter bwriter = null;
		FileWriter out = null;
		
		try {
		in = new FileReader("C:"+a);
		breader = new BufferedReader(in);
		
		out = new FileWriter("C:\\Temp\\Copyed.txt");
		bwriter = new BufferedWriter(out);
		
		int c;
		while((c = in.read()) != -1 ) {
			bwriter.write(c);
		}
		
		if(in != null) {in.close();}
		if(breader != null) {breader.close();}
		if(bwriter != null) {bwriter.close();}
		if(out != null) {out.close();}	
		}
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}

		
	}

}
