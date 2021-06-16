package itwn.com.homework.task0615;

import java.io.*;
import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) throws IOException {
//		在电脑磁盘中创建一个目录(D:/images) 使用字节流将图片上传到指定目录中(循环结合Scanner上传)
//		请输入您要上传的图片(从项目目录中选择相对路径:images/)上传之前你的先判断文件是否存在，并且判断是否是图片？
//		(.jpg,.png,.jpeg)
		Scanner scanner=new Scanner(System.in);
		File file=new File("C:\\JavaProgram\\FileTest\\images");
		String towardsPath="\\\\192.168.5.69\\42\\images/";
		int index=1;
		File[] fs=file.listFiles();
		for (File file1:fs){
			if (file1.isFile()) {
				System.out.println((index++) + ":" + file1.getName());
			}
		}
		while (true) {
			System.out.println("选择一个：(5退出）");
			String input = scanner.next();
			if (input.equals("1")) {
				upLode(fs[1].getAbsolutePath(),towardsPath);
			} else if (input.equals("2")) {
				upLode(fs[2].getAbsolutePath(),towardsPath);
			} else if (input.equals("3")) {
				upLode(fs[3].getAbsolutePath(),towardsPath);
			} else if (input.equals("4")) {
				upLode(fs[4].getAbsolutePath(),towardsPath);
			} else if (input.equals("5")) {
					break;
			} else{
				System.out.println("输入不正确");
			}
		}

	}

	public static void upLode(String fromPath,String towards) throws IOException {
		if (fromPath.endsWith(".jpg") || fromPath.endsWith(".jpeg") || fromPath.endsWith(".png")) {
			InputStream in = new FileInputStream(fromPath);
			OutputStream out = new FileOutputStream(towards+"(newUpload)"+new File(fromPath).getName(),true);
			byte[] bs = new byte[1024];
			int temp = -1;
			while ((temp = in.read(bs)) != -1) {
				out.write(bs, 0, temp);
			}
			in.close();
			out.close();
			System.out.println("上传成功");
		}else {
			System.out.println("不是图片");
		}
	}

}
