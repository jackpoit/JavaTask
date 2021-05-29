package itwn.com.homework.littletrik;
import java.util.Scanner;
public class XiTong {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            String user = "";
            String password = "";
            int mebNum = 0;
            boolean dependRegis = false;
            boolean dependLogin = false;
            boolean dependFlag = false;
        //变量
        do {
            {
                System.out.println("*****欢迎进入讲课富翁系统*****");
                System.out.println("         1.注册            ");
                System.out.println("         2.登录            ");
                System.out.println("         3.抽奖            ");
                System.out.println("**************************");
                System.out.print("请选择菜单：");
            }
            //菜单打印
            if (in.hasNextInt()) {
                int input1 = in.nextInt();
                if (input1 !=1 && input1 !=2 && input1 != 3) {
                    System.out.println("您的输入有误，请重新输入\n");
                    continue;
                }
                //(没输123）
                else if (input1 == 2) {
                    if (!dependLogin) {
                        if (!dependRegis) {
                            System.out.println("未注册\n");

                        } else {
                            System.out.println("[讲课富翁系统>登录]");
                            for (int i = 1; i <= 3; i++) {
                                System.out.print("请输入用户名：");
                                String userInput = in.next();
                                System.out.print("请输入密码：");
                                String passwordInput = in.next();
                                if (userInput.equals(user) && passwordInput.equals(password)) {
                                    System.out.println("欢迎您：" + user);
                                    dependLogin = true;
                                    break;

                                } else {
                                    System.out.printf("用户名密码输入错误，您最多还有%d次机会\n", 3 - i);
                                }
                            }
                            if (!dependLogin) {
                                System.out.println("果咩内 再见");
                                break;
                            }


                        }
                    }else {
                        System.out.println("已登录");
                    }


                }
                //登录功能
                else if (input1 == 3) {
                    if (!dependLogin) {
                        System.out.println("未登录\n");
                    }else {
                        if (!dependFlag){
                            dependFlag=true;
                            System.out.println("[讲课富翁系统>抽奖]");
                            System.out.print("请输入你的卡号:");
                            int input3=in.nextInt();
                            if (input3==mebNum){
                                int num1=(int) (Math.random() * 9000) + 1000;
                                int num2=(int) (Math.random() * 9000) + 1000;
                                int num3=(int) (Math.random() * 9000) + 1000;
                                int num4=(int) (Math.random() * 9000) + 1000;
                                int num5=(int) (Math.random() * 9000) + 1000;
                                if (mebNum!=num1&&mebNum!=num2&&mebNum!=num3&&mebNum!=num4&&mebNum!=5){
                                    System.out.printf("本日的幸运数字为：%d\t%d\t%d\t%d\t%d\n",num1,num2,num3,num4,num5);
                                    System.out.println("抱歉，您不是本日的幸运会员！");
                                }else {
                                    System.out.println("中奖啦！");
                                }
                            }else {
                                System.out.println("卡号输入错误");
                            }
                        }else {
                            System.out.println("已经抽过奖了");
                        }
                    }
                }
                //抽奖功能
                else {
                    if (!dependRegis) {
                        System.out.println("[讲课富翁系统>注册]");
                        System.out.println("请填写注册信息：");
                        System.out.print("用户名：");
                        user = in.next();
                        System.out.print("密码：");
                        password = in.next();
                        dependRegis = true;
                        mebNum = (int) (Math.random() * 9000) + 1000;

                        System.out.println("\n注册成功，请记好您的会员卡号");
                        System.out.println("用户名\t\t密码\t\t会员卡号");
                        System.out.println(user + "\t\t" + password + "\t\t" + mebNum);
                    }else {
                        System.out.println("已经注册了 不要重复注册");
                    }
                }
                //注册功能
            }else {
                System.out.println("您的输入有误！");
                in.next();
            }
                //输入有误的判断
            {
                System.out.print("继续吗？（y/n)");
                String input2 = in.next();
                if (input2.equals("y")) {
                    System.out.println("\n");
                } else {
                    System.out.println("\n系统退出，谢谢使用！");
                    break;
                }
            }
            //循环
        }while (true);
        in.close();
    }
}