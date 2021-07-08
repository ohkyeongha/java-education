package multinetwork;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public static DataInputStream dis;
	public static DataOutputStream dos;

	public static void main(String[] args) {
		
		Socket socket = null;
		//서버접속
		try {
			System.out.println("--------------클라이언트--------------");
			Scanner sc = new Scanner(System.in);
//			System.out.print("ID를 입력하세요 : ");
//			String id = sc.nextLine();
			ClientFrame cf = new ClientFrame();
			String id = cf.getId();
			
			socket = new Socket("192.168.0.219",7777);
			System.out.println("서버 접속 완료");
			
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			dos.writeUTF(id);
			dos.flush();
			
			Thread clientSenderT = new Thread(new ClientSender(id));
			Thread clientReceiverT = new Thread(new ClientReceiver(cf));
			
			clientSenderT.start();
			clientReceiverT.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
