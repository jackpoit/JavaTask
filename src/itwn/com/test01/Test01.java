package itwn.com.test01;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
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
