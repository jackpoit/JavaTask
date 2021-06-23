package itwn.com.test.test08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest02 {
	private static ServerSocket server=null;
	private static Socket client=null;
	private final static int PORT=9688;
	private static DataInputStream ins=null;
	private static DataOutputStream out=null;

	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		server=new ServerSocket(PORT);
		client=server.accept();
		ins=new DataInputStream(client.getInputStream());
		out=new DataOutputStream(client.getOutputStream());
		new Thread(()->{
			while (true){
				try {
					System.out.println("客户端："+ins.readUTF());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}).start();
		new Thread(()->{
			while (true){
				System.out.println("服务端：");
				String respond=scanner.next();
				try {
					out.writeUTF(respond);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}).start();
	}
}
