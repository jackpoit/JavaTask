package itwn.com.test.test08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest02 {
	private static Socket client = null;
	private final static String HOST="192.168.5.21";
	private final static int PORT = 9688;
	private static DataInputStream ins = null;
	private static DataOutputStream out = null;

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		client = new Socket(HOST,PORT);
		ins = new DataInputStream(client.getInputStream());
		out = new DataOutputStream(client.getOutputStream());
		new Thread(()->{
			while (true){
				try {
					System.out.println("服务端：" + ins.readUTF());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}).start();
		new Thread(()->{
			while (true){
				System.out.print("客户端：");
				String request = scanner.next();
				try {
					out.writeUTF(request);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}).start();
//		new Thread(()->{
//			while (true){
//				try {
//					System.out.println("服务端：" + ins.readUTF());
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//
//		}).start();
//		new Thread(()->{
//			while (true){
//				System.out.print("客户端：");
//				String request = scanner.next();
//				try {
//					out.writeUTF(request);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//
//		}).start();


	}
}