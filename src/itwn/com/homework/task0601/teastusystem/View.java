package itwn.com.homework.task0601.teastusystem;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User user=new User();
		while (true){
			System.out.print("输入教师（t),学生（s)");
			String input=sc.next();
			if (input.equals("t")){
				System.out.print("姓名");
				String name=sc.next();
				System.out.print("论文数");
				int num=sc.nextInt();
				user.record(new Teacher(name,num));
			}else if (input.equals("s")){
				System.out.print("姓名");
				String name=sc.next();
				System.out.print("成绩");
				int score=sc.nextInt();
				user.record(new Student(name,score));
			}else {
				break;
			}
		}
		System.out.println("优秀教师，学生名单如下：");
		System.out.println(user.getList());
	}
}
