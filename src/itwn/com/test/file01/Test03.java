package itwn.com.test.file01;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {
		showFile(new File("C:\\JavaProgram\\java_class\\JavaDay01"));
	}
	public static void showFile(File file){
		if (file.exists()){
			if (file.isDirectory()){
				System.out.println(file.getAbsolutePath());
				File[] fs=file.listFiles();//只有file为file时才会返回null;
					for (File f : fs) {
						showFile(f);
					}
			}else {
				System.out.println(file.getAbsolutePath());
			}
		}else {
			System.out.println("不存在");
		}

	}
}
