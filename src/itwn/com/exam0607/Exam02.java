package itwn.com.exam0607;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str1=scanner.next();
		StringBuilder sb=new StringBuilder(str1);
		String str2=sb.reverse().toString();
		System.out.println(str1.equals(str2)?"该字符串是对称的":"该字符串不对称");
		scanner.close();
	}
}
