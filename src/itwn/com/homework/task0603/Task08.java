package itwn.com.homework.task0603;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task08 {
	private static boolean depend=false;
	private static int count=0;
	private static int winCount=0;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (true){
			System.out.println("是否开始游戏(y(开始游戏)/n(结束游戏)):");
			String input=sc.next();
			depend=false;
			if (input.equals("y")){
				count++;
				System.out.println("你的三个数是："+Arrays.toString(game()));
				if (depend){
					System.out.println("win");
					winCount++;
				}else {
					System.out.println("lose");
				}
			}else if (input.equals("n")){
				System.out.println("总游戏次数："+count+",胜率："+winCount*100/(double)count+"%");
				break;
			}else {
				System.out.println("输入有误");
			}
		}
		sc.close();
	}
	public static int[] game(){
		Random random=new Random();
		 int[] rnums=new int[3];
		for (int i=0;i<3;i++){
			rnums[i]=random.nextInt(10);
			if (rnums[i]==8){
				depend=true;
			}
		}
		return rnums;
	}
}
