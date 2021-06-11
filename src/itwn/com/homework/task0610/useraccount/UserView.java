package itwn.com.homework.task0610.useraccount;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class UserView {
	private static Scanner scanner=new Scanner(System.in);
	private static UserDAO userDAO=new UserDAO();
	private static String loginUserNo;
	public static void main(String[] args) {
			mainView();
	}
	public static void mainView(){
		while (true) {
			System.out.println(MyUtil.view("登录", "注册", "忘记密码", "查询用户", "退出系统"));
			String input=scanner.next();
			if (input.equals("1")) {
				loginView();
			} else if (input.equals("2")) {
				registerView();
			} else if (input.equals("3")) {
				String userNo=MyUtil.letterDepend(0);
					if (userDAO.nameCheck(userNo)){
						String userPass=MyUtil.letterDepend(1);
						if (userDAO.modifyPass(userNo,userPass)){
							System.out.println("修改成功");
						}else {
							System.out.println("不要输入原密码");
						}
					}else {
						System.out.println("查无此人");
					}
			} else if (input.equals("4")) {
					userDAO.queryAllUser();
			}else if (input.equals("5")) {
				System.out.println("正在退出");
				System.exit(0);
			} else {
				System.out.println("您的输入有误");
			}
		}
	}
	public static void loginView(){
		String userNo=MyUtil.letterDepend(0);
		String userPass=MyUtil.letterDepend(1);
		if (MyUtil.rnums(4)){
			int i=userDAO.login(userNo,userPass);
			if (i==1){
				System.out.println("账号密码正确");
					loginUserNo=userNo;
					loginSuccessView();
			}else if (i==0){
				System.out.println("密码错误");
			}else {
				System.out.println("无此用户");
			}
		}else {
			System.out.println("验证码错误");
		}
	}
	public static void registerView(){
		String userNo=MyUtil.letterDepend(0);
		if(userDAO.register(userNo)){
			System.out.println("注册成功");
		}else {
			System.out.println("注册失败，用户名已注册");
		}
	}
	public static void loginSuccessView(){
		while (true) {
			System.out.println(MyUtil.view("存钱", "取钱", "转账", "查看个人信息","返回上一层"));
			String input=scanner.next();
			if (input.equals("1")) {
				System.out.println("请输入要存的钱数：");
				double money=scanner.nextDouble();
				if (userDAO.savaMoney(loginUserNo,money)){
					System.out.println("存入成功");
				}else {
					System.out.println("存入失败，金额必须被100整除");
				}
			} else if (input.equals("2")) {
				System.out.println("请输入要取的钱数：");
				double money=scanner.nextDouble();
				if (userDAO.getUserMoney(loginUserNo,money)){
					System.out.println("取款成功");
				}else {
					System.out.println("取款失败");
				}
			} else if (input.equals("3")) {
				System.out.println("请输入转账人名：");
				String transTarget=scanner.next();
				if (userDAO.nameCheck(transTarget)){
					System.out.println("请输入转账金额：");
					double money=scanner.nextDouble();
					if (userDAO.transMoney(loginUserNo,money,transTarget)){
						System.out.println("转账成功");
					}else {
						System.out.println("转账失败");
					}
				}else {
					System.out.println("查无此人");
				}
			} else if (input.equals("4")) {
				System.out.println(userDAO.queryUser(loginUserNo));
			}else if (input.equals("5")) {
				System.out.println("正在退出");
				break;
			} else {
				System.out.println("您的输入有误");
			}
		}
	}
}
