package itwn.com.file01;

import java.io.*;

public class Test07 {
	public static void main(String[] args) throws IOException {
		String path1="C:\\JavaProgram\\java_class\\JavaDay09\\JavaDay09\\src\\com\\itwn\\singleton/LazySingleton.java";
		String path2="\\\\192.168.5.69\\42\\file\\"+"sunboru.txt";
//		copyFile(path1,path2);
		writeFile("file/test.txt","arwqsdgargsadgwe");
	}
	public static void copyFile(String path1,String path2) throws IOException {
		Reader reader=new FileReader(path1);
		Writer writer=new FileWriter(path2,true);
		char[] chars=new char[1024];
		int temp=-1;
		while ((temp=reader.read(chars))!=-1){
			writer.write(chars);
		}
		writer.close();
		reader.close();
	}
	public static void writeFile(String path,String str)throws IOException{
		Writer writer=new FileWriter(path);
		writer.write(str);
		writer.close();
	}
	public static void readFile(String path) throws IOException {
		StringBuilder stringBuilder=new StringBuilder();
		Reader reader=new FileReader(path);
		char[] chars=new char[1024];
		int temp=-1;
		while ((temp= reader.read(chars))!=-1){
			stringBuilder.append(chars);
		}
		reader.close();
		System.out.println(chars);

	}
}
