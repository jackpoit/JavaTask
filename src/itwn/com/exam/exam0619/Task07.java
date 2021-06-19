package itwn.com.exam.exam0619;

import java.util.Scanner;

public class Task07 {
	private static Scanner scanner=new Scanner(System.in);
	private static BookDAO bookDAO=new BookDAO();
	public static void main(String[] args) {
	  mainView();


	}
	public static void mainView(){
		while (true){
			System.out.println("***************** 欢迎进入图书馆关系系统 **********************");
			System.out.println("1.查看所有书籍信息");
			System.out.println("2.添加图书(书籍名称唯一)");
			System.out.println("3.根据书籍名称删除书籍");
			System.out.println("4.根据书籍名称模糊搜索书籍");
			System.out.println("5.退出系统");
			System.out.println("******************************************************************");
			System.out.println("请输入选项：");
			String input=scanner.next();
			if ("1".equals(input)){
				bookDAO.queryBook();
			}else if("2".equals(input)){
				addBook();
			}else if("3".equals(input)){
				delBook();
			}else if("4".equals(input)){
				System.out.println("请输入书名：");
				String name=scanner.next();
				System.out.println("查询到下列书名：");
				String str=bookDAO.check(name);
				System.out.println(str);

			}else if("5".equals(input)){
				System.exit(0);
			}else{
				System.out.println("输入错误");
			}
		}
	}
	public static void addBook(){
		System.out.println("请输入书名：");
		String name=scanner.next();
		System.out.println("请输入作者：");
		String author=scanner.next();
		System.out.println("请输入价格：");
		double price=scanner.nextDouble();

		Book book=new Book(name,author,price);

		if (bookDAO.add(book)){
			System.out.println("添加成功");
		}else {
			System.out.println("添加失败");
		}

	}
	public static void delBook(){
		System.out.println("请输入书名：");
		String name=scanner.next();

		if (bookDAO.del(name)){
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}

	}

}
