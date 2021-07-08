package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamEx3 {
	
	public static void main(String[] args){
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("src\\bytestream\\test");
			fos = new FileOutputStream("src\\bytestream\\test_output");
//			int data=0;
			
			int len=0;
			byte[] buf = new byte[8];
			while((len=fis.read(buf))!=-1) {
				
				fos.write(buf,0,len);
//				System.out.print(new String(buf));
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
