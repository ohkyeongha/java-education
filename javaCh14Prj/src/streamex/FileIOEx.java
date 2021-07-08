package streamex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIOEx {

	public static void main(String[] args) {
//		1. scanner 사용해서 콘솔 입력받은 값 파일로 출력
		
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = null;
		try {
			//파일에 스트림을 통해서 입력할 준비
			fos = new FileOutputStream("src\\streamex\\consoleOutputFile",true);
			
			while(true){
				String input = sc.next();
				input += "\n";
				if(input.equals("0")) {
					break;
				}
				byte[] inputArray = input.getBytes();	//자동으로 바이트 단위로 잘라주는 메서드
				fos.write(inputArray);
				fos.flush();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();	//fos 닫아주기
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
