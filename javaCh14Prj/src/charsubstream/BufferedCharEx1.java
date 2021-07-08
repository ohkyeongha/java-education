package charsubstream;

import java.io.*;

public class BufferedCharEx1 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Users\\kitri\\Desktop\\오경하\\2. Java\\강의자료\\madangdata.txt");
			br = new BufferedReader(fr);
			
//			String line = br.readLine();	//한 줄 읽기
//			System.out.println(line);
			
//			int data = 0;
//			while((data = fr.read()) != -1) {
//				System.out.println((char)data);
//			}
			
			String line ="";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
