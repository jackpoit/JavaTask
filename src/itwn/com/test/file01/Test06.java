package itwn.com.test.file01;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test06 {
	public static void main(String[] args) throws IOException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		String timeStr=sdf.format(new Date());
		String path1="C:\\JavaProgram\\FileTest\\images/孙博儒.jpg";
		String path2="\\\\192.168.5.69\\42\\images/"+"孙博儒_"+timeStr+".jpg";
		upload(path1,path2);
	}
	public static void upload(String path1,String path2) throws IOException {
		InputStream in=new FileInputStream(path1);
		OutputStream out=new FileOutputStream(path2);
		byte[] bs=new byte[1024];
		int temp=-1;
		while ((temp=in.read(bs))!=-1){
			out.write(bs,0,temp);
		}
		in.close();
		out.close();

	}
}
