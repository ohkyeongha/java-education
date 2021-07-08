package network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread{
	
	private Socket socket;
	
	//소켓 초기화
	public Sender(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		OutputStream out = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			out = socket.getOutputStream();
			dos = new DataOutputStream(out);
			
			while (dos != null) {
				String data = sc.nextLine();
				dos.writeUTF(data);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
