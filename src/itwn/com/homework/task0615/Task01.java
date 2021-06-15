package itwn.com.homework.task0615;

import java.io.File;

public class Task01 {
	static int dirCount=0;
	static int fileCount=0;
	public static void main(String[] args) {

		countFile(new File("C:\\JavaProgram\\java_class"));
		System.out.println("文件夹数："+dirCount);
		System.out.println("文件数:"+fileCount);
	}
	public static void countFile(File file){
		if (file.exists()){
			if (file.isDirectory()){
				dirCount++;
				System.out.println(file.getAbsolutePath());
				for (File file1:file.listFiles()){
					countFile(file1);
				}
			}else {
				fileCount++;
				System.out.println(file.getAbsolutePath());
			}

		}else {
			System.out.println("不存在");
		}
	}
}
