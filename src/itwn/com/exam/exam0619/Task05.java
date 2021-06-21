package itwn.com.exam.exam0619;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Task05 {
	private static List<Poker> totalList=new LinkedList<>();//总牌
	private static List<Poker> user1List=new LinkedList<>();//1-4号玩家
	private static List<Poker> user2List=new LinkedList<>();
	private static List<Poker> user3List=new LinkedList<>();
	private static List<Poker> user4List=new LinkedList<>();

	public static void main(String[] args) {
//		要求实现将2副牌发给4个人，尽可能公平？ （15分）
//		<1>.成功创建2副牌<2>.洗牌<3>.发牌<4>.验牌<5>.对4个人手里的牌进行排序

		//创建2副牌
		createPoker();
		createPoker();
		System.out.println(totalList+""+totalList.size());

		//洗牌
		int opCount=1000;//洗牌次数
		for (int i=0;i<opCount;i++){
			Collections.shuffle(totalList);
		}
		System.out.println(totalList+""+totalList.size());

		//发牌
		for (int i=0;i<totalList.size();i++){
			if (i%4==0){
				user1List.add(totalList.get(i));
			}else if (i%4==1){
				user2List.add(totalList.get(i));
			}else if (i%4==2){
				user3List.add(totalList.get(i));
			}else if (i%4==3){
				user4List.add(totalList.get(i));
			}
		}
		System.out.println("user1:\n"+user1List+user1List.size());
		System.out.println("user2:\n"+user2List+user2List.size());
		System.out.println("user3:\n"+user3List+user3List.size());
		System.out.println("user4:\n"+user4List+user4List.size());

		//排序
		Comparator<Poker> comparator=new Comparator<Poker>() {
			@Override
			public int compare(Poker o1, Poker o2) {
				return Integer.compare(o2.getId(),o1.getId());
			}
		};
		user1List.sort(comparator);
		user2List.sort(comparator);
		user3List.sort(comparator);
		user4List.sort(comparator);

		System.out.println("user1:\n"+user1List+user1List.size());
		System.out.println("user2:\n"+user2List+user2List.size());
		System.out.println("user3:\n"+user3List+user3List.size());
		System.out.println("user4:\n"+user4List+user4List.size());



	}
	public static void createPoker(){
		String[] colors={"♣","♦","♠","♥"};
		String[] values={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		for (int i=0;i<values.length;i++){
			for (int j=0;j<colors.length;j++){
				totalList.add(new Poker(colors[j],values[i]));
			}
		}
		totalList.add(new Poker("","小王"));
		totalList.add(new Poker("","大王"));
		Poker.count=0;


	}


}
