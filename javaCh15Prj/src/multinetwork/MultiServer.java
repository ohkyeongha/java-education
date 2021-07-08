package multinetwork;

import java.io.*;
import java.net.*;
import java.util.HashMap;

public class MultiServer {
//	public static DataInputStream dis;
//	public static DataOutputStream dos;
	
	public static HashMap<Socket, DataOutputStream> socketList;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			//클라이언트 접속을 하기위한 소켓 생성
			serverSocket = new ServerSocket(7777);
			System.out.println("-----------------서버----------------");
			socketList = new HashMap<Socket, DataOutputStream>();
			
			while (true) {
				
//				synchronized (MultiServer.class) {
//					socket = serverSocket.accept();
//				}
				
				System.out.println("서버 접속 대기중...");
				//클라이언트와 통신할 소켓 리턴
				Socket socket = serverSocket.accept();
				
//				InputStream in = socket.getInputStream();
//				OutputStream out = socket.getOutputStream();
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				socketList.put(socket, dos);
				
				String id = dis.readUTF();
//				System.out.println(id +"님이 접속했습니다.");
				
				System.out.println(socketList.size() + "명 접속");
				
				Thread multiSendT = new Thread(new MultiServerSender(socket, id));
				multiSendT.start();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

	}

}
