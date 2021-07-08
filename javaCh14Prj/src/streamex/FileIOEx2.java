package streamex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import madang.Book;
import madang.BookFunction;

public class FileIOEx2 {

	public static void main(String[] args) {
//		파일 input스트림 생성
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\kitri\\Desktop\\오경하\\2. Java\\강의자료\\madangdata.txt");
			
//			파일 읽기
//			int data = 0;
			int cnt=0;
			byte[] buf = new byte[10];
			String bookData = "";
			while ((/*data*/cnt=fis.read(buf)) != -1) {
//				data = fis.read();
				bookData += new String(buf,0,cnt);
//				System.out.print(new String(buf));
				
			}
//			System.out.println(bookData);
			
			BookFunction bf = new BookFunction();
			
//			String 값 자르기 (|)
			String[] rowData = bookData.split("\\|");
			for (int i = 0 ; i < rowData.length ; i++) {
//				System.out.println(rowData[i].trim());
				Book book = new Book();
				String row = rowData[i].trim();
//				String 값 자르기 (,)
				String[] data = row.split(",");
				book.setBookId(Integer.parseInt(data[0]));
				book.setBookName(data[1]);
				book.setPublisher(data[2]);
				book.setPrice(Integer.parseInt(data[3]));
				
				bf.insertBook(book);
			}
			
			bf.selectBook();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
