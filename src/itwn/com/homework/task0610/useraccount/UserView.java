package itwn.com.homework.task0610.useraccount;

import java.util.Scanner;

public class UserView {
	private static Scanner scanner=new Scanner(System.in);
	private static UserDAO userDAO=new UserDAO();
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
					userDAO.queryUser();
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

	}
}
