package itwn.com.homework.task0610.useraccount;

import java.util.Scanner;

public class ATMUtil {
	public static final String[][] strRegexs=new String[][]{
		{"账号","^[a-zA-Z][a-zA-Z0-9]{2,5}$","由3-6位的数字，字母组成，首位不能是数字"},
		{"密码","^[0-9]{6}$","由6位数字组成"},
		{"手机号码","^1[0-9]{10}$","首位是1 后面由10个数字组成"},
		{"存款金额","^[1-9][0-9]*.[0-9]*$","首位不能为0"},
		{"订单状态","^[1-2]$","1.已付款 2.已收货"}};

	//登录输出
	public static String view(String...strs){
		String res="******************\n";
		for (int i=1;i<=strs.length;i++){
			res+=i+"."+strs[i-1]+"\n";
		}
		res+="******************\n请输入选项：";
		return res;
	}

	//输入正则检测
//	public static String letterDepend(int i){
//		Scanner scanner=new Scanner(System.in);
//		String res=null;
//		while (true){
//			System.out.println("请输入"+strRegexs[i][0]+":");
//			System.out.println("("+strRegexs[i][2]+")");
//			res=scanner.next();
//			if (res.matches(strRegexs[i][1])){
//				break;
//			}else {
//				System.out.println("输入错误");
//			}
//		}
//			return res;
//	}
	public static boolean rnums(int codeLength){
		Scanner scanner=new Scanner(System.in);
			String res="";
			String rnum="";
			for (char c='0';c<='9';c++){
				rnum+=c;
			}
			for (char c='a';c<='z';c++){
				rnum+=c;
			}
			for (char c='A';c<='Z';c++){
				rnum+=c;
			}
			for (int i=0;i<codeLength;i++){
				res+=rnum.charAt((int)(Math.random()*62));
			}
		System.out.println(res);
		System.out.println("请输入验证码：");
		if (res.equalsIgnoreCase(scanner.next())){
			return true;
		}
			return false;
	}
}
