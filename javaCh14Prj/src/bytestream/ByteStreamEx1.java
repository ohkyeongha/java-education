package bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteStreamEx1 {
	public static void main(String[] args) {
		byte[] bArr = {1,2,3,4,5,6,7,8,9,10};
		
//		----------------------------->
//		 10  9  8  7  6  5  4  3  2  1
//		----------------------------->
		
		//콘솔용 스트림을 통해 출력
//		System.out.println(bArr[0]);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bArr);
		
//		int date = bis.read(); //read()는 java에서 읽는 방법. 그 자체로 출력하진 않는다
//		
//		System.out.println(bis.read());
//		System.out.println(bis.read());
		int data = 0;
		while(/*true*/(data = bis.read()) == -1) {
//			if((data = bis.read()) == -1) {
//				break;
//			}
			System.out.println(data);
		}
		
		//1파이브 out
		byte[] bOutArr = new byte[bArr.length];
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
//		int outData = bArr[0];
//		
//		bos.write(outData);
		
//		----------------------------->
//		                             1
//		----------------------------->
//		pc output -> input pc1   output -> input pc2
//		bOutArr = bos.toByteArray();
//		
//		System.out.println(bOutArr[0]);
		
		for(int i=0 ; i < bArr.length ; i++) {
			int outDate = bArr[i];
			bos.write(outDate);
		}
		
		bOutArr = bos.toByteArray();
		
		System.out.println(bOutArr[0]);
		for (int i=0 ; i <bOutArr.length ; i++) {
			System.out.println(bOutArr[i]);
			
		}
		
	}
}
