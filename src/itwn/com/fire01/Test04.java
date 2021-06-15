package itwn.com.fire01;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
			deletDir(new File("physics"));
	}
	public static void deletDir(File file){
		if (file.exists()){
			if (file.isDirectory()){
				File[] fs=file.listFiles();//只有file为file时才会返回null;
				if (fs.length==0){
					file.delete();
				}else {
					for (File f:fs){
						deletDir(f);
					}
					file.delete();
					//!!!要加这一句  当文件夹中的文件都delete完了 直接吧空文件夹delete;
				}

			}else {
				file.delete();
			}
		}else {
			System.out.println("不存在");
		}
	}
}
