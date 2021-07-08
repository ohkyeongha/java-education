package subStream;

import java.io.*;

public class BufferedStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\kitri\\Desktop\\JAVA 14.pdf");
			FileOutputStream fos = new FileOutputStream("src\\subStream\\JAVA 14.pdf");
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
//			int data = bis.read();
//			System.out.println((char)data);
			int data =0;
			long startTime = System.currentTimeMillis();
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			bos.flush();
			long endTime = System.currentTimeMillis();
			
			System.out.println("걸린 시간 : " + (endTime - startTime));
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
