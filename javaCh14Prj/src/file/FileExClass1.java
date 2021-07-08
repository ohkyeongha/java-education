package file;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class FileExClass1 {

	public static void main(String[] args) {
//		File file = new File("C:\\Users\\kitri\\Desktop\\fileTest\\test.txt");
//		File file = new File("src" + File.separator + "file" + File.separator + "test.txt");
		File file = new File("src\\file\\test2.txt");
		
		System.out.println("파일명 : " + file.getName());
		System.out.println("파일의 경로 : " + file.getPath());	//내가 입력한 경로
		System.out.println("파일의 절대경로 : " +file.getAbsolutePath());	//이 파일의 전체 경로
		System.out.println("파일의 부모 디렉토리 경로 : " + file.getParent());
		
		try {
			
			if(file.exists()) {	//파일이 존재하는지 확인
				System.out.println("파일이 존재");
			} else {
				//파일 생성
				file.createNewFile();
				System.out.println("파일 생성");
			}
			
			File dir = new File("C:\\Users\\kitri\\Desktop\\fileTest");
			if(dir.isFile()) {
				System.out.println("파일이다");
			} else if(dir.isDirectory()) {
				System.out.println("디렉토리다");
				
				File[] files = dir.listFiles();
				for (int i = 0; i < files.length; i++) {
					if(files[i].isFile()) {
						System.out.println("파일명 : " + files[i].getName());
						
					} else {
						System.out.println("디렉토리 : " + files[i].getName());
					}
				}
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
