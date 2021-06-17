package itwn.com.test.test01;

import java.util.Scanner;

public abstract class Test01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String passRegex="^1[0-9]{10}$";
		String str=null;
		while (true){
			System.out.println("请输入密码");
			str=scanner.next();
			if (str.matches(passRegex)){
				break;
			}else {
				System.out.println("匹配失败");
			}

		}
	}
}
