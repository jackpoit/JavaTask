package itwn.com.homework.littletrik;

import java.util.Scanner;
public class MYCalender {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        do {
            System.out.println("输入年");
            int year;
            while (true){
                if (in.hasNextInt()){
                    year=in.nextInt();
                    if (year>=1900&&year<=2022){
                        break;
                    }else {
                        System.out.println("请输入有效范围内的年份：");
                    }
                }else {
                    System.out.println("输入的不是数字");
                    in.nextLine();
                }
            }
            System.out.println("输入月");
            int month;
            while (true){
                if (in.hasNextInt()){
                    month=in.nextInt();
                    if (month>=1&&month<=12){
                        break;
                    }else {
                        System.out.println("请输入有效范围内的月份：");
                    }
                }else {
                    System.out.println("输入的不是数字");
                    in.nextLine();
                }
            }
            int sum=0;
            for (int i=1900;i<year;i++) {
                if ((i%4==0&&i%100!=0)||i % 400 == 0){
                    sum+=366;
                }else{
                    sum+=365;
                }
            }
            for (int i=1;i<month;i++){
                if (i==4||i==6||i==9||i==11){
                    sum+=30;
                }else if (i==2){
                    if ((year%4==0&&year%100!=0)||year%400==0){
                        sum+=29;
                    }else{
                        sum+=28;
                    }
                }else {
                    sum+=31;
                }
            }
            sum++;
            System.out.println("星期"+sum%7);
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            int maxDay;
            if (month==4||month==6||month==9||month==11){
                maxDay=30;
            }else if (month==2){
                if ((year%4==0&&year%100!=0)||year%400==0){
                    maxDay=29;
                }else{
                    maxDay=28;
                }
            }else {
                maxDay=31;
            }
            // 输入月最大天数
            int weekDay=sum%7;
            for (int i=1;i<=weekDay;i++){
                System.out.print("\t");
            }
            //输入月第一天前的空白
            for (int i=1;i<=maxDay;i++){
                if (sum%7==6){
                    System.out.print(i+"\n");
                }else {
                    System.out.print(i+"\t");
                }
                sum++;
            }
            System.out.print("\n继续吗？（y/n)");
            String input2 = in.next();
            if (input2.equals("y")) {
                System.out.println("\n");
            } else {
                System.out.println("\n系统退出，谢谢使用！");
                break;
            }
        }while (true);
        in.close();
    }
}
