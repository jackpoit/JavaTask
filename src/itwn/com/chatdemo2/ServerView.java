package itwn.com.chatdemo2;

import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerView {
	private final static int PORT=9688;


	public static void main(String[] args) throws IOException {
		ServerSocket server= new ServerSocket(PORT);
		Vector<Socket> list=new Vector<>();
		while (true){
			ExecutorService es= Executors.newCachedThreadPool();
			Socket client=server.accept();
			list.add(client);
			System.out.println(client);
			es.execute(()->{
				Socket socket=client;
				try {
					DataInputStream in=new DataInputStream(socket.getInputStream());
					String str=in.readUTF();
					for (Socket s:list){
						if (!s.equals(socket)){
							DataOutputStream out =new DataOutputStream(socket.getOutputStream());
							out.writeUTF(str);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
	}

}

