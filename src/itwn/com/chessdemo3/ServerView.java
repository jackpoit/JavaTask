package itwn.com.chessdemo3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerView {
	private static int port=8888;
	//1.存储多个客户端
	private static Vector<Socket> list=new Vector<Socket>();
	//2.服务端
	private static ServerSocket server;
	
	public static void main(String[] args) {
		
		try {
			//1.创建一个服务
			server=new ServerSocket(port);
			//2.能够无限制的创建线程...线程池
			ExecutorService es=Executors.newCachedThreadPool();
			//2.可以不断的接收客户端的请求
			while(true) {
				Socket client=server.accept();
				System.out.println(client+"已经上线了...");
				list.add(client);
				//1.接收一个客户端，给这个客户端开辟一个线程(读这个客户端发送过来的数据，往其他客户端发送数据)
				es.execute(()->{
					Socket socket=client;//记录当前的客户端信息
					try {
						DataInputStream ins=new DataInputStream(socket.getInputStream());
						//2.不断读取客户端发送过来的数据，写给其他客户端
						while(true) {
							//3.读到客户端发送过来的数据
							String clientTalk=ins.readUTF();
							System.out.println(client+":"+clientTalk);
							//3.写给其他客户端
							for(Socket s:list) {
								if(s!=socket) {//不要发给自己本身
									DataOutputStream out=new DataOutputStream(s.getOutputStream());
									out.writeUTF(clientTalk);
								}
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				});
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
