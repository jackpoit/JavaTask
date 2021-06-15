package itwn.com.homework.task0615;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task05 {
	static 	String recyclePath="C:\\JavaProgram\\FileTest\\recyclebox/";
	public static void main(String[] args) throws IOException {
//		实现删除文件备份
//		clearFile目录(专门用于存放删除文件的目录)
//		log.txt(用来记录原先文件的位置) 原先的目录,新的目录，时间
//		file1目录(选择删除的文件目录)
//		file2目录(选择删除的文件目录)
//		只考虑文件。。。

		File logFile=new File(recyclePath+"log.txt");
		String deletePath="C:\\JavaProgram\\FileTest\\towards/222.txt";
		File delFile=new File(deletePath);
		OutputStream outputStream=new FileOutputStream(logFile,true);
		outputStream.write(deleteFile(delFile).getBytes());
		outputStream.close();


	}
	public static String deleteFile(File file) throws IOException {

		InputStream in = new FileInputStream(file);
		OutputStream out = new FileOutputStream(recyclePath+"(delete)"+file.getName());
		byte[] bs = new byte[1024];
		int temp = -1;
		while ((temp = in.read(bs)) != -1) {
			out.write(bs, 0, temp);
		}
		in.close();
		out.close();
		String res=file.getName()+":\n"+"原目录："+file.getAbsolutePath()+"\n"+
				"现目录:" + recyclePath+"(delete)"+file.getName()+"\n" +
				"删除时间："+new Date().toLocaleString()+"\n\n\n";
		 file.delete();
		return res;
	}
//	class log{
//		String fowardPath;
//		String newPath;
//		Date date;
//		public log(){}
//		public log(String fowardPath, String newPath, Date date) {
//			this.fowardPath = fowardPath;
//			this.newPath = newPath;
//			this.date = date;
//		}

	}

