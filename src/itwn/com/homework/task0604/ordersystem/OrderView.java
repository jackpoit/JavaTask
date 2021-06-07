package itwn.com.homework.task0604.ordersystem;

import java.util.Scanner;

public class OrderView {
	private static Scanner scanner=new Scanner(System.in);
	private static BuyUserDAO buyUserDAO=new BuyUserDAO();
	public static void main(String[] args) {
			mainView();
	}
	public static String loginUserAccount;
	//主界面
	public static void mainView(){
		while (true) {
			System.out.println(MyUtil.view("登录", "注册", "查看所有用户信息", "退出系统"));
			String input = scanner.next();
			if (input.equals("1")) {
					loginView();
			} else if (input.equals("2")) {
					registerView();
			} else if (input.equals("3")) {
				System.out.println("正在查询所有用户信息");
				buyUserDAO.queryAllUser();
			} else if (input.equals("4")) {
				System.out.println("正在退出");
				System.exit(0);
			} else {
				System.out.println("您的输入有误");
			}
		}
	}
	//登录界面
	public static void loginView() {
		System.out.println("请输入账户：");
		String account = scanner.next();
		BuyUser loginUser = buyUserDAO.nameCheck(account);
		if (loginUser != null) {
			System.out.println("账户正确");
			System.out.println("请输入密码：");
			String pass = scanner.next();
			if (loginUser.getUserPass().equals(pass)) {
				System.out.println("密码正确,正在登陆......");
				loginUserAccount =loginUser.getUserAccount();
				insideView();
			}else {
				System.out.println("密码错误，请重新登录");
			}
		}else {
			System.out.println("账户未注册");
		}

	}
	//注册界面
	public static void registerView(){
		String userNo=MyUtil.letterDepend(0);
		String userPass=MyUtil.letterDepend(1);
		String userPhone=MyUtil.letterDepend(2);
		String userEmail=MyUtil.letterDepend(3);
		BuyUser regisBuyUser =new BuyUser(userNo,userPass,userPhone,userEmail);
		if(buyUserDAO.register(regisBuyUser)==1){
			System.out.println("注册成功");
		}else {
			System.out.println("该用户名已被注册");
		}
	}

	//里界面
	public static void insideView(){
		while (true) {
			System.out.println(MyUtil.view("查看所有订单信息", "添加订单", "确认收货",
					"删除订单","时间排序","返回上一层","退出系统"));
			String input = scanner.next();
			if (input.equals("1")) {
				System.out.println("正在查询用户所有订单....");
				buyUserDAO.queryAllOrder(loginUserAccount);
			} else if (input.equals("2")) {
				addOrder();
			} else if (input.equals("3")) {
				modify();
			} else if (input.equals("4")) {
				remove();
			}else if (input.equals("5")) {
				buyUserDAO.sortOrder(loginUserAccount);
			} else if (input.equals("6")) {
				System.out.println("正在返回上层...");
				break;
			} else if (input.equals("7")) {
				System.out.println("正在退出...");
				System.exit(0);
			} else {
				System.out.println("您的输入有误");
			}
		}
	}

	//添加订单
	public static void addOrder() {
//		String startTime = MyUtil.letterDepend(4);
//		String endTime = MyUtil.letterDepend(5);
		double money = Double.parseDouble(MyUtil.letterDepend(6));
		int status = Integer.parseInt(MyUtil.letterDepend(7));
		int i = buyUserDAO.addOrder(money, status, loginUserAccount);
		if (i == 1) {
			System.out.println("订单添加成功");
		}else {
			System.out.println("添加失败");
		}
	}
	//修改状态
	public static void modify(){
		System.out.println("请输入订单编号");
		String id=scanner.next();
		int index=buyUserDAO.idCheck(id,loginUserAccount);
		if (index==-1){
			System.out.println("没有此订单");
		}else {
			int mod= buyUserDAO.modifyOrder(index,loginUserAccount);
			if (mod==1){
				System.out.println("修改成功");
			}else {
				System.out.println("订单已经确认收货,修改失败");
			}
		}
	}
	//删除订单
	public static void remove(){
		System.out.println("请输入订单编号");
		String id=scanner.next();
		int index=buyUserDAO.idCheck(id,loginUserAccount);
		if (index==-1){
			System.out.println("没有此订单");
		}else {
			int mod= buyUserDAO.removeOrder(index,loginUserAccount);
			if (mod==1){
				System.out.println("删除成功");
			}else {
				System.out.println("订单未确认收货，删除失败");
			}
		}
	}
}
