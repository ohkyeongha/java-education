package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			while(true) {
				//클라이언트 접속을 위한 서버소켓 생성(방문 만들어주기)
				System.out.println("접속 대기중...");
				
				//클라이언트 접속 무한정 대기
				socket = serverSocket.accept();
				
				InputStream in = socket.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				
				String id = dis.readUTF();
				System.out.println(id + "님이 접속 하였습니다.");
				
				//send
				Thread sendThread = new Sender(socket);
				sendThread.start();
				
				//receive
				String data = "";
				while ((data=dis.readUTF()) != null) {
					System.out.println(id + " : " + data);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
