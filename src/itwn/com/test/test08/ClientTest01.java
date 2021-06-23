package itwn.com.test.test08;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest01 {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		int port=7098;
		String host="192.168.5.21";
		Socket socket=new Socket(host,port);
		while (true) {
			System.out.println("输入");
			String input =scanner.next();
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF(input);
		}
	}
}
