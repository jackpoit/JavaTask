package itwn.com.test.test08;

import java.io.*;

public class Test01 {
	public static void main(String[] args) {
//		try {
//			writeFile("file/user.txt","啦啦啦");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		try {
			readFile("file/user.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void writeFile(String path,String talk) throws IOException {
		DataOutputStream out=new DataOutputStream(new FileOutputStream(path,true));
		out.writeUTF(talk);
		out.close();
	}
	public static void readFile(String path) throws IOException {
		DataInputStream in=new DataInputStream(new FileInputStream(path));
		String line=in.readUTF();
			System.out.println(line);
		in.close();
	}
}
