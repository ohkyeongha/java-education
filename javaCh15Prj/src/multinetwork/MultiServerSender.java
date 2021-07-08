package multinetwork;

import java.io.*;
import java.net.Socket;
import java.util.Iterator;
import java.util.Set;

public class MultiServerSender implements Runnable {

	private Socket socket;
	private String id;

	public MultiServerSender(Socket socket, String id) {
		this.socket = socket;
		this.id = id;
	}

	@Override
	public void run() {

		DataInputStream dis = null;
//		DataOutputStream dos = null;

//      dos = MultiServer.dos;

		String data = "";
		try {
			
			dis = new DataInputStream(socket.getInputStream());
			MessageEcho(id + "님이 접속하였습니다.");
			//Client가 보낸 값을 읽어서 모든 Client한테 보내는 내용
			while ((data = dis.readUTF()) != null) {
				MessageEcho(data);
			}
			
		} catch (Exception e) {
//			e.printStackTrace();
			MessageEcho(id + "님이 접속을 해제했습니다.");
			MultiServer.socketList.remove(this.socket);
		}

	}
    
    
    public void MessageEcho(String msg) {
    	DataOutputStream dos = null;

    	try {
    		
			// 서버의 로그
			System.out.println(msg);

			// 클라이언트 소켓의 리스트
			Set<Socket> setList = MultiServer.socketList.keySet();
			Iterator<Socket> it = setList.iterator();

			// 모든 클라이언트에게 메세지 전달
			while (it.hasNext()) {
				Socket client = it.next();
				// client는 맴에 담겨져있는 소켓들
				//
				if (client != this.socket) {
					dos = MultiServer.socketList.get(client);
					dos.writeUTF(msg);
					dos.flush();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}