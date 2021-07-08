package multinetwork;

import java.io.*;

public class ClientReceiver implements Runnable{
	
	private ClientFrame cf;
	
	public ClientReceiver(ClientFrame cf) {
		this.cf = cf;
	}

	@Override
	public void run() {
		DataInputStream dis = Client.dis;
		try {
			String inputData = "";
			while ((inputData = dis.readUTF())!=null) {
				//클라이언트 콘솔
//				System.out.println(inputData);
				cf.putChatText(inputData);
			}
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
