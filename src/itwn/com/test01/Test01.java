package itwn.com.test01;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public abstract class Test01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String passRegax="^[1-9][0-9]{5,10}@qq.com$";
		String str=null;
		while (true){
			System.out.println("请输入密码");
			str=scanner.next();
			if (str.matches(passRegax)){
				break;
			}else {
				System.out.println("匹配失败");
			}

		}
	}
}
