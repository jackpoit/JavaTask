package itwn.com.homework.task0608.poker;

import java.util.Scanner;

public class PokerView {
	private static Scanner sc=new Scanner(System.in);
	private static PokerDao pokerDao=new PokerDao();
	public static void main(String[] args) {
		mainMenu();
	}
	public static void mainMenu(){
		while (true) {
			System.out.println("-------------");
			System.out.println("1.开牌");
			System.out.println("2.洗牌");
			System.out.println("3.发牌");
			System.out.println("4.查牌");
			System.out.println("5.码牌");
			System.out.println("6.退出系统");
			System.out.println("-------------");
			System.out.println("请输入选项:");
			String mainInput=sc.next();
			if (mainInput.equals("1")){
				pokerDao.newPoker();
				System.out.println("开牌成功");
			}else if (mainInput.equals("2")){
				System.out.println("请选择洗牌次数：");
				int shuffleCount=sc.nextInt();
				pokerDao.shuffle(pokerDao.getTotalList(),shuffleCount);
			}else if (mainInput.equals("3")){
				if(pokerDao.givePoker()){
					System.out.println("发牌结束");
				}else {
					System.out.println("已经发过牌了");
				}
			}else if(mainInput.equals("4")){
					getPoker();
			}else if(mainInput.equals("5")){
				pokerDao.sortPoker(pokerDao.getUser1list());
				pokerDao.sortPoker(pokerDao.getUser2list());
				pokerDao.sortPoker(pokerDao.getUser3list());
				System.out.println("码牌结束");
			}else if(mainInput.equals("6")){
				System.out.println("退出系统");
				break;
			}else {
				System.out.println("您的输入有误");
			}
		}
	}

	public static void getPoker() {
		while (true) {
			System.out.println("--------------------");
			System.out.println("1.用户1");
			System.out.println("2.用户2");
			System.out.println("3.用户3");
			System.out.println("4.底牌");
			System.out.println("5.返回上一层");
			System.out.println("--------------------");
			System.out.println("请输入选项:");
			String input = sc.next();
			if (input.equals("1")) {
				System.out.println("用户1的牌数为："+pokerDao.getUser1list().size());
				System.out.println(pokerDao.getPoker(pokerDao.getUser1list()));
			} else if (input.equals("2")) {
				System.out.println("用户2的牌数为："+pokerDao.getUser2list().size());
				System.out.println(pokerDao.getPoker(pokerDao.getUser2list()));
			} else if (input.equals("3")) {
				System.out.println("用户3的牌数为："+pokerDao.getUser3list().size());
				System.out.println(pokerDao.getPoker(pokerDao.getUser3list()));
			} else if (input.equals("4")) {
				System.out.println("底牌的牌数为："+pokerDao.getTotalList().size());
				System.out.println(pokerDao.getPoker(pokerDao.getTotalList()));
			} else if (input.equals("5")) {
				System.out.println("正在返回上一层");
				break;
			} else {
				System.out.println("您的输入有误");
			}
		}
	}
}
