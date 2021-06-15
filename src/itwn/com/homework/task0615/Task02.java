package itwn.com.homework.task0615;

import java.io.File;

public class Task02 {
	public static void main(String[] args) {
		deleteFile(new File("JavaDay01"));
	}
	public static void deleteFile(File file){
		if (file.exists()){
			if (file.isDirectory()) {
				File[] fs = file.listFiles();
				for (File file1 : fs) {
					deleteFile(file1);
				}
			}
			file.delete();
		}else {
			System.out.println("不存在");
		}
	}
}
