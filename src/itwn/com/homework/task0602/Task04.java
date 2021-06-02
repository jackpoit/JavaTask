package itwn.com.homework.task0602;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年份：");
		String output=sc.next()+0;
		String[] list={"台式机","笔记本","其他"};
		System.out.println("请输入产品类型（1.台式机 2.笔记本 3.其他）");
		output+=list[sc.nextInt()-1];
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

		for (int i=0;i<3;i++){
			output+=rnum.charAt((int)(Math.random()*62));
		}
		System.out.println(output);

	}
}
