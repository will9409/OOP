import java.io.*;
public class BufferedIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStreamReader in = new InputStreamReader(System.in);
		
		BufferedOutputStream out = new BufferedOutputStream(System.out,5);
	
		
		int c;
		try {	
		
		while((c = in.read()) != -1) {
			out.write(c);
		}
		out.flush();
		if(in != null) {
			in.close();
			out.close();	
		}
		
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}
	}

}
