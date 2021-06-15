package itwn.com.fire01;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		String s=sdf.format(new Date());
		File file=new File("log/"+s+".txt");
		File parent=file.getParentFile();
		if (!parent.exists()){
			System.out.println(parent.mkdir());
		}
		if (!file.exists()){
			try {
					System.out.println(file.createNewFile());
			} catch (IOException e) {
					e.printStackTrace();
			}
		}else {
			System.out.println("已存在");
		}
	}
}
