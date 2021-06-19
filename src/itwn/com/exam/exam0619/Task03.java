package itwn.com.exam.exam0619;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task03 {
	public static void main(String[] args) {
//		使用合适的IO流将本地磁盘(“D:/file/user.txt”)的一个文本文件上传到到项目的目录（file/user_时间戳.txt）中
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		String str=sdf.format(new Date());
			try {
				BufferedReader reader=new BufferedReader(new FileReader("D:/file/user.txt"));
				BufferedWriter writer=new BufferedWriter(new FileWriter("file/user_"+str+".txt"));
				String line=null;
				while ((line=reader.readLine())!=null) {
					writer.write(line);
				}
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
