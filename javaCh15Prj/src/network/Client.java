package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		Scanner sc = null;
		
		try {
			//클라이언트 소켓이 서버의 서버소켓으로 접속을 한다.
			socket = new Socket("localhost", 7777);
			//localhost
			//192.168.0.235 : 쌤
			//192.168.0.219 : 지수언니

			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			System.out.print("id 입력 : ");
			sc = new Scanner(System.in);
			String id = sc.nextLine();
			
			dos.writeUTF(id);
			dos.flush();//*
			
			System.out.println("접속 완료");
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			Thread sendThread = new Sender(socket);
			sendThread.start();
			
			while(dis!=null) {
	            //계속 receive상태
	            String data = dis.readUTF();
	            System.out.println("서버 : " + data);
	         }

			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
