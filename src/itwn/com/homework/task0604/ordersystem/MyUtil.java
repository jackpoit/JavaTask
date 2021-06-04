package itwn.com.homework.task0604.ordersystem;

import java.util.Scanner;

public class MyUtil {
	private static final String[][] strRegexs=new String[][]{
		{"用户账号","^[a-zA-Z][a-zA-Z0-9]{3,5}$","由4-6位的数字，字母组成，首位不能是数字"},
		{"用户密码","^[0-9]{6}$","由6位数字组成"},
		{"手机号码","^1[0-9]{10}$","首位是1 后面由10个数字组成"},
		{"qq邮箱","^[1-9][0-9]{5,10}@qq.com$","前面由6-11位的数字组成，0数字不能是首位，后面由qq.com组成"},
		{"订单下单时间","^20[0-9]{6}$","格式为20xxxxxx"},
		{"订单完成时间","^20[0-9]{6}$","格式为20xxxxxx"},
		{"订单金额","^[1-9][0-9]*.[0-9]*$","首位不能为0"},
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
	public static String letterDepend(int i){
		Scanner scanner=new Scanner(System.in);
		String res=null;
		while (true){
			System.out.println("请输入"+strRegexs[i][0]+":");
			System.out.println("("+strRegexs[i][2]+")");
			res=scanner.next();
			if (res.matches(strRegexs[i][1])){
				break;
			}else {
				System.out.println("输入错误");
			}
		}
			return res;
	}

}
