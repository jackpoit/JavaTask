package itwn.com.exam.exam0619;

import java.io.File;

public class Task06 {
	private static int fileCount=0;
	private static int dirCount=0;
	public static void main(String[] args) {
//	6.现有目录(D:/Woniu/images) 要求分别统计有多少个目录多少个文件组成，统计完成之后要求将此目录删除(15分)

		String path="D:/Woniu/images";
		File file=new File(path);
		countFile(file);
		System.out.println("由"+fileCount+"个文件组成");
		System.out.println("由"+dirCount+"个目录组成");
	}
	public static void countFile(File file){
		if (file.exists()){
			if(file.isDirectory()){
				dirCount++;
				File[] fs=file.listFiles();
				for (File file1:fs){
					countFile(file1);
				}
			}else {
				fileCount++;
			}
			file.delete();
		}else {
			System.out.println("不存在");
		}
	}
}
