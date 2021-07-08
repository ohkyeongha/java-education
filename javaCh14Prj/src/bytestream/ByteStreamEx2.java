package bytestream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteStreamEx2 {

	public static void main(String[] args) throws IOException {
		// read() + 1바이트 읽어서 실제 1바이트 데이터를 변환
//		 예) 1234 -> read 결과값은 1 / 2 / 3 / 4
		
		
		
		// read(바이트배열)	 - 바이트배열 크기만큼 읽어서 바이트배열 크기만을 변환
//		 예) 1234 -> (바이트배열의 크기가 3이면) read 결과값은 크기 3이 반환
//					 : 바이트배열 byte[] b라고 하면 b = {4,4,4}가 실려있음
		
		
		
		
		// read(바이트배열, 시작위치, 읽을크기) - 바이트배열을 시작위치에서 읽을크기만큼 읽어서 실제 데이터 크기를 반환
//		 예) 1235 -> (바이트배열의 크기가 4이면, 시작위치 1, 읽을위치 3)
//					read 결과값은 읽ㅇ르 크기의 실제 데이터 크기를 반환
//					: 바이트배열이 byte[] b라고 하면 b ={2,3,5}가 실려있음
		
		byte[] bArr = {1,2,3,4,5,6,7,8,9,10};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bArr);
		
		byte[] buf = new byte[4];
		
//		System.out.println(bis.read(buf));	//읽는방법 1 : 하나하나 읽는다
		
		int len =0;
//		while((len = bis.read(buf)) != -1) {	//읽는 방법 2 : 반복문 실행
//			for(int i=0 ; i<buf.length ; i++) {	//버퍼를 덮어쓰기 때문에 나머지 값이 뒤에 붙는다
//				System.out.print(buf[i]);
//				
//			}
//		}
		
//		System.out.println(bis.read(buf,0,len));	//buf = {1234}
//		System.out.println(bis.read(buf,0,len));	//buf = {5678}
//		System.out.println(bis.read(buf,0,len));	//buf = {910}
		
		len = buf.length;
		
		while((len = bis.read(buf,0,len))!= -1) {
			for(int i=0 ; i < len ; i++) {
				System.out.print(buf[i] + " ");
			}
		}
		
		
		
	}

}
