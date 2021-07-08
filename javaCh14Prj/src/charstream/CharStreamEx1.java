package charstream;

import java.io.*;

public class CharStreamEx1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileReader fr = null;
		
		FileWriter fw = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\kitri\\Desktop\\오경하\\2. Java\\강의자료\\madangdata.txt");
			fr = new FileReader("C:\\Users\\kitri\\Desktop\\오경하\\2. Java\\강의자료\\madangdata.txt");
			fw = new FileWriter("C:\\Users\\kitri\\Desktop\\madang.txt");
			
//			int len =0;
//			byte[] buf = new byte[1024];
////			int dataInput=0;
//			while((len = fis.read(buf)) != -1) {
//				System.out.print(new String(buf,0,len));
//			}
//			System.out.println("---------------------");
			int data=0;
			while((data = fr.read()) != -1) {
				fw.write((char)data);
//				System.out.print((char)data);
			}
			fw.flush();
			
			
//			int data = fr.read();
//			System.out.println((char)data);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
