package itwn.com.homework.task0602;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 		String[] list={"傻子","笨蛋","垃圾","nc","枪","军火"};
		System.out.println("请输入：");
		String input=sc.nextLine();
		int i=0;
		while (i<list.length){
			if (input.contains(list[i])){
				input=input.replace(list[i],"*" );
			}else {
				i++;
			}
		}
		System.out.println(input);
	}
}
