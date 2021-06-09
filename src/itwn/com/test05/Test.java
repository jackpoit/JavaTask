package itwn.com.test05;

import java.util.*;

public class Test {
	private static LinkedList<String> list=new LinkedList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (true) {

			System.out.println("***********");
			System.out.println("1.qwea");
			System.out.println("2.qwea");
			System.out.println("3.qwea");
			System.out.println("4.qwea");
			System.out.println("5.qwea");
			System.out.println("6.qwea");
			System.out.println("7.qwea");
			System.out.println("8.qwea");
			System.out.println("9.退出a");
			System.out.println("10.查看浏览记录");
			System.out.println("***********");
			System.out.println("请选择：");
			String input =sc.next();
			if (input.equals("9")){
				break;
			}else if (input.equals("10")){
				System.out.println("\n\n\n");
				for (int i=0;i<list.size();i++){
					System.out.print(list.get(list.size()-1-i));
				}
				System.out.println("\n\n\n");

			}else if ("12345678".contains(input)){
					add(input);
			}else {
				System.out.println("输入错误");
			}
		}
	}
	public static void add(String input) {
		if (list.contains(input)) {
			list.remove(input);
		} else {
			if (list.size() >= 5) {
				list.removeFirst();
			}
		}
		list.addLast(input);
	}
}
