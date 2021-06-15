package itwn.com.file01;

import java.io.*;

public class Test05 {
	public static void main(String[] args) throws IOException {
		write("\\\\192.168.5.67\\42/签名.txt","surprise mf\n");
	}
	public static void write(String path,String message) throws IOException {
		OutputStream out=new FileOutputStream(path,true);
		out.write(message.getBytes());
		out.close();
	}
}
