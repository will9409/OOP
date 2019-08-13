import java.io.*;
import java.util.Scanner;
public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("Ã¹¹øÂ° ÆÄÀÏ ÀÔ·Â: ");
		String a = s.next();

		System.out.print("µÎ¹øÂ° ÆÄÀÏ ÀÔ·Â: ");
		String b = s.next();
		
		FileReader in = null;
		FileReader in1 = null;
		BufferedReader breader = null;
		BufferedReader breader1 = null;
		BufferedWriter bwriter = null;
		BufferedWriter bwriter1 = null;
		FileWriter out = null;
		FileWriter out1 = null;
		
		try {
		in = new FileReader("C:"+a);
		breader = new BufferedReader(in);
		out = new FileWriter("C:\\Temp\\Sum.txt");
		bwriter = new BufferedWriter(out);
		
		int c;
		int d;
		while((c = in.read()) != -1 ) {
			bwriter.write(c);
		}
		
		in1 = new FileReader("C:"+b);
		breader1 = new BufferedReader(in1);
		out1 = new FileWriter("C:\\Temp\\Sum.txt",true);
		bwriter1 = new BufferedWriter(out1);
		while((d = in1.read()) != -1 ) {
			bwriter1.write(d);
		}
		
		if(in != null) {in.close();}
		if(in1 != null) {in1.close();}
		if(breader != null) {breader.close();}
		if(breader1 != null) {breader1.close();}
		if(bwriter != null) {bwriter.close();}
		if(bwriter1 != null) {bwriter1.close();}
		if(out != null) {out.close();}		
		}
		catch(IOException e) {
			System.out.println("ÆÄÀÏ º¹»ç ¿À·ù");
		}

	}

}
