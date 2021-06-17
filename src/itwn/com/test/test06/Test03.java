package itwn.com.test.test06;

import java.io.File;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		File fileDir = new File("\\\\192.168.5.66\\42\\孙博儒\\app\\image\\user");
		if (fileDir.exists()) {
			System.out.println("失败");
		} else {
			System.out.println(fileDir.mkdirs());
		}

		File file=new File("\\\\192.168.5.66\\42\\孙博儒\\app\\image\\user/孙博儒.txt");
		if (file.exists()){
			System.out.println("存在");
		}else {
			try {
				System.out.println(file.createNewFile());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
