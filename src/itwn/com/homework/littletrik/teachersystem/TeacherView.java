package itwn.com.homework.littletrik.teachersystem;

import java.util.Scanner;

public class TeacherView {
	private static Scanner sc=new Scanner(System.in);
	private static TeacherDao teacherDao=new TeacherDao();
	public static void main(String[] args) {
		mainview();
	}
	//主界面
	public static void mainview(){
		while (true) {
			System.out.println("*************");
			System.out.println("1.教师登录");
			System.out.println("2:教师注册");
			System.out.println("3.查看所有教师信息");
			System.out.println("4:退出系统");
			System.out.println("*************");
			System.out.println("请输入选项：");
			String op1=sc.next();
			if (op1.equals("1")){
					loginView();
			}else if (op1.equals("2")){
					regisView();
			}else if (op1.equals("3")){
				if (teacherDao.getTeacherList().size()==0){
					System.out.println("没有人注册");
				}else {
					System.out.println(teacherDao.getTeacherList());
				}
			}else if (op1.equals("4")){
				System.out.println("正在退出系统.....");
				break;
			}else{
				System.out.println("您的输入有误");
			}
		}
	}
	//登录界面
	public static void loginView(){
		System.out.println("请输入用户名");
		String teaName=sc.next();
		if (teacherDao.nameCheck(teaName)==null){
			System.out.println("该用户名尚未注册");
		}else {
			System.out.println("用户名输入正确，请输入密码");
			String teaPass=sc.next();
			if (teacherDao.passCheck(teaName,teaPass)==1){
				String randomStr=teacherDao.randomStr();
				System.out.println(randomStr);
				System.out.println("请输入验证码：");
				String input1=sc.next();
				if (randomStr.equalsIgnoreCase(input1)){
					System.out.println("验证成功，正在登录....");
					loginSuccessView();
				}else {
					System.out.println("验证失败请重新登录");
				}
			}else {
				System.out.println("密码错误请重新登录");
			}
		}
	}
	//注册界面
	public static void regisView(){
			System.out.println("请输入用户名：");
			String teaName = sc.next();
			System.out.println("请输入密码：");
			String teaPass=sc.next();
			System.out.println("请输入手机号：");
			String teaPhoneNum=sc.next();
			if (teacherDao.register(teaName,teaPass,teaPhoneNum)==0){
				System.out.println("该用户名已注册");
			}else {
				System.out.println("注册成功！");
			}
	}
	//登录成功界面
	public static void loginSuccessView(){
		while (true) {
			System.out.println("*************");
			System.out.println("1.添加学生");
			System.out.println("2:修改成绩");
			System.out.println("3.删除学生");
			System.out.println("4:查询所有学生信息");
			System.out.println("5:查看成绩排序成绩");
			System.out.println("6.返回上一页");
			System.out.println("7:退出系统");
			System.out.println("*************");
			System.out.println("请输入选项：");
			String op1=sc.next();
			if (op1.equals("1")){
				addStudentView();
			}else if (op1.equals("2")){
				if (teacherDao.getStudentList().size()==0){
					System.out.println("没有添加学生");
				}else {
					modifyStuView();
				}
			}else if (op1.equals("3")){
				if (teacherDao.getStudentList().size()==0){
					System.out.println("没有添加学生");
				}else {
					removeView();
				}
			}else if (op1.equals("4")){
				if (teacherDao.getStudentList().size()==0){
					System.out.println("没有添加学生");
				}else {
					System.out.println(teacherDao.getStudentList());
				}
			}else if (op1.equals("5")){
				removeView();
			}else if (op1.equals("6")){
				System.out.println("正在返回上层.....");
				break;
			}else if (op1.equals("7")){
				System.out.println("正在退出.....");
				System.exit(0);
			}else{
				System.out.println("您的输入有误");
			}
		}
	}

	//添加学生
	public static void addStudentView(){
		System.out.println("请输入用户名：");
		String stuName = sc.next();
		System.out.println("请输入手机号：");
		String stuPhoneNum=sc.next();
		System.out.println("请输入分数：");
		int stuScore=sc.nextInt();
		if (teacherDao.addStu(stuName,stuPhoneNum,stuScore)==0){
			System.out.println("该学生已被添加（手机号重复）(分数应在0-100）");
		}else {
			System.out.println("添加成功！");
		}
	}
	//修改成绩 密码
	public static void modifyStuView(){
		System.out.println("请输入学生编号：");
		int num= sc.nextInt();
		if (teacherDao.IDCheck(num)<0){
			System.out.println("没有找到该学生");
		}else {
			System.out.println("请输入您要修改的信息：");
			System.out.println("1.密码");
			System.out.println("2.成绩");
			String input2=sc.next();
			if (input2.equals("1")){
				System.out.println("请输入您要修改的密码");
				String pass=sc.next();
				if (teacherDao.modifySomething(pass,num)==1){
					System.out.println("修改密码成功");
				}else {
					System.out.println("修改失败");
				}
			}else if (input2.equals("2")){
				System.out.println("请输入您要修改的成绩");
				int score=sc.nextInt();
				if (teacherDao.modifySomething(score,num)==1){
					System.out.println("修改成功");
				}else {
					System.out.println("修改失败,成绩范围为0-100");
				}
			}else {
				System.out.println("您的输入有误");
			}
		}
	}
	public static void removeView(){
		System.out.println("请输入学生编号：");
		int num= sc.nextInt();
		if (teacherDao.removeStu(num)==0){
			System.out.println("没有找到该学生");
		}else {
			System.out.println("删除完成");
		}
	}

}
