package itwn.com.homework.littletrik.atm;

import java.util.Scanner;

public class UserView {
    private static Scanner sc=new Scanner(System.in);
    private static UserDao userDao=new UserDao();
    private static String loginUserName=null;
    //private static User user=null;
    //private static String
    public static void main(String[] args) {
        mainView();
    }
    //主界面
    public static void mainView(){
       while (true) {
           System.out.println("--------------------");
           System.out.println("1.登录");
           System.out.println("2.注册");
           System.out.println("3.修改密码");
           System.out.println("4.查看所有用户信息");
           System.out.println("5.退出登陆");
           System.out.println("6.退出系统");
           System.out.println("--------------------");
           System.out.println("请输入选项:");
           String mainInput=sc.next();
           if (mainInput.equals("1")){
                loginView();
           }else if (mainInput.equals("2")){
                registerView();
           }else if (mainInput.equals("3")){
                modifyPass();
           }else if(mainInput.equals("4")){
               System.out.println("正在查询所有用户信息");
               userDao.quaryAllUser();
           }else if(mainInput.equals("5")){
               loginUserName=null;
               break;
           }else if(mainInput.equals("6")){
               System.out.println("退出系统");
               break;
           }else {
               System.out.println("您的输入有误");
           }
       }

    }

    //登录界面
    public static void loginView() {
        System.out.println("请输入用户名：");
        String name = sc.next();
        User loginUser = userDao.nameCheck(name);
        if (loginUser != null) {
            System.out.println("用户名正确");
            System.out.println("请输入密码：");
            String pass = sc.next();
            if (loginUser.getUserPass().equals(pass)) {
                System.out.println("密码正确,正在登陆");
                loginUserName=name;
                //跳到loginSuccessView
                loginSuccessView();
            }else {
                System.out.println("密码错误，请重新登录");
            }
        }else {
            System.out.println("用户名未注册");
            }
        }
    //注册界面
    public static void registerView(){
        System.out.println("请输入用户名：");
        String userName=sc.next();
        System.out.println("请输入密码：");
        String userPass=sc.next();
        System.out.println("请输入手机号：");
        String userPhone=sc.next();
        System.out.println("请输入要存的钱数：");
        double money=sc.nextDouble();
        User regisUser=new User(userName,userPass,userPhone,money);
        if(userDao.register(regisUser)==1){
            System.out.println("注册成功");
        }else {
            System.out.println("该用户名已被注册");
        }
    }
    //修改密码
    public static void modifyPass(){
        System.out.println("请输入要修改的用户名：");
        String name=sc.next();
        User temp=userDao.nameCheck(name);
        if(temp==null){
            System.out.println("没有该用户");
        }else {
            System.out.println("请输入原密码：");
            String oldPass=sc.next();
            if (oldPass.equals(temp.getUserPass())){
                System.out.println("请输入要修改的密码：");
                String newPass=sc.next();
                if (newPass.equals(oldPass)){
                    System.out.println("请不要输入原密码");
                } else {
                    userDao.modify(newPass,temp);
                    System.out.println("修改密码成功");
                }
            }else {
                System.out.println("抱歉，原密码错误");
            }
        }
    }
    //登录成功界面
    public static void loginSuccessView(){
        while (true) {
            System.out.println("--------------------");
            System.out.println("欢迎您，"+loginUserName);
            System.out.println("1.取钱");
            System.out.println("2.存钱");
            System.out.println("3.转账");
            System.out.println("4.查看个人信息");
            System.out.println("5.返回上一层");
            System.out.println("--------------------");
            System.out.println("请输入选项:");
            String mainInput=sc.next();
            if (mainInput.equals("1")){
                getMoney();
            }else if (mainInput.equals("2")){
                saveMoney();
            }else if (mainInput.equals("3")){
                transform();
            }else if(mainInput.equals("4")){
                System.out.println(userDao.nameCheck(loginUserName));
            }else if(mainInput.equals("5")){
                System.out.println("正在返回上一层");
                break;
            }else {
                System.out.println("您的输入有误");
            }
        }
    }
    //取钱
    public static void getMoney(){
        System.out.println("请输入要取出的金额：");
        double getMoney=sc.nextDouble();
        userDao.getMoney(getMoney,loginUserName);
        System.out.println("您的剩余金额为："+userDao.nameCheck(loginUserName).getMoney());
    }
    //存钱
    public static void saveMoney(){
        System.out.println("请输入要存入的金额：");
        double saveMoney=sc.nextDouble();
        userDao.saveMoney(saveMoney,loginUserName);
        System.out.println("您的剩余金额为："+userDao.nameCheck(loginUserName).getMoney());
    }
    //转账
    public static void transform(){
        System.out.println("请输入收款者用户名：");
        String transName = sc.next();
        if (transName.equals(loginUserName)){
            System.out.println("请不要输入您自己的用户名");
        }else {
            User transUser = userDao.nameCheck(transName);
            if (transUser != null) {
                System.out.println("请输入要转账的金额：");
                double transMoney = sc.nextDouble();
                userDao.transMoney(transMoney, loginUserName, transName);
                System.out.println("您的剩余金额为：" + userDao.nameCheck(loginUserName).getMoney());
            } else {
                System.out.println("该用户不存在");
            }
        }
    }
}
