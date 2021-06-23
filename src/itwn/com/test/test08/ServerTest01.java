package itwn.com.test.test08;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest01 {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket=new ServerSocket(7098);
		Socket client=serverSocket.accept();
		DataInputStream in=new DataInputStream(client.getInputStream());
		while (true){
			System.out.println(in.readUTF());
		}


	}
}
