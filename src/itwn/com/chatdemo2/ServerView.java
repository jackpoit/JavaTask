package itwn.com.chatdemo2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerView {
	private final static int PORT = 9888;
	private static ServerSocket server;
	private static Vector<Socket> list = new Vector<>();

	public static void main(String[] args) {
		try {
			server = new ServerSocket(PORT);
			ExecutorService es = Executors.newCachedThreadPool();
			while (true) {
				Socket client = server.accept();
				list.add(client);
				System.out.println(client+"111");
				es.execute(() -> {
					Socket socket = client;
					try {
						DataInputStream in = new DataInputStream(socket.getInputStream());
						while (true) {
							String str = in.readUTF();
							for (Socket s : list) {
								if (s!=socket) {
									DataOutputStream out = new DataOutputStream(s.getOutputStream());
									out.writeUTF(str);
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

