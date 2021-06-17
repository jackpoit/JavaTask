package itwn.com.test.file01;

import java.io.*;

public class Test08 {
	public static void main(String[] args) throws IOException {
		String path="file\\user.txt";
////		writeFile(path,"lalala");
//		// DataIn / Out  put Stream
//
//		StringBuilder sb=new StringBuilder();
//		DataOutputStream don=new DataOutputStream(new FileOutputStream(path,true));
//		DataInputStream din=new DataInputStream(new FileInputStream(path));
//		// in  out 流不能写反，不然 in中的fileIN 创建的是空
//		//Exception in thread "main" java.io.FileNotFoundException: file/user.txt (系统找不到指定的文件。)
//		int[] nums={100,200,300,400,500};
//		for (int i:nums){
//			don.writeInt(i);
//		}
//		Integer a=null;
//		while (din.available()>0) {
//			System.out.println(din.readInt());
//		}
//		din.close();
//		don.close();

	}
	public static void readFile(String path) throws IOException {
		StringBuilder sb=new StringBuilder();
		BufferedReader bufferedReader=new BufferedReader(new FileReader(path));

		String line=null;
		while ((line=bufferedReader.readLine())!=null){
			sb.append(line).append("\n");
		}
		bufferedReader.close();
		System.out.println(sb.toString());

	}
	public static void writeFile(String path,String message)throws IOException{
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(path,true));
		bufferedWriter.write(message);
		bufferedWriter.close();

	}
	public static void copyFile(String fromPath,String towardPath)throws IOException{
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(towardPath));
		BufferedReader bufferedReader=new BufferedReader(new FileReader(fromPath));
		String line=null;
		while ((line=bufferedReader.readLine())!=null){
			bufferedWriter.write(line);
		}
		bufferedReader.close();
		bufferedWriter.close();

	}
}
