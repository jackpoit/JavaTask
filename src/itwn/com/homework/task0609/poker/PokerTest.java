package itwn.com.homework.task0609.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PokerTest {
	private static ArrayList<Poker> list0=new ArrayList<>();
	public static void main(String[] args) {
		list0.addAll(createPoker());
		list0.addAll(createPoker());
		System.out.println("发牌:\n"+list0);

		shuffle(list0,1000);
		System.out.println("洗牌:\n"+list0);

		givePoker(list0);
	}
	public static ArrayList<Poker> createPoker(){
		 ArrayList<Poker> list=new ArrayList<>();
		String[] colors= {"♦","♣","♥","♠"};
		String[] values= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		for (int i=0;i<13;i++){
			for (int j=0;j<4;j++){
				list0.add(new Poker(colors[j],values[i] ));
			}
		}
		list0.add(new Poker("","小王"));
		list0.add(new Poker("","大王"));
		Poker.count=0;
		return list;
	}
	public static void shuffle(ArrayList<Poker> list,int count){
		for (int i=0;i<count;i++){
			Collections.shuffle(list);
		}
	}
	public static void givePoker(ArrayList<Poker> list){
		ArrayList<Poker> list1=new ArrayList<>();
		ArrayList<Poker> list2=new ArrayList<>();
		ArrayList<Poker> list3=new ArrayList<>();
		ArrayList<Poker> list4=new ArrayList<>();
		for (int i=0;i<list.size();i++){
			if (i%4==0){
				list1.add(list.get(i));
			}else if (i%4==1){
				list2.add(list.get(i));
			}else if (i%4==2){
				list3.add(list.get(i));
			}else{
				list4.add(list.get(i));
			}
		}
		System.out.println("玩家1:\n"+list1.size()+sortPoker(list1));
		System.out.println("玩家2:\n"+list2.size()+sortPoker(list2));
		System.out.println("玩家3:\n"+list3.size()+sortPoker(list3));
		System.out.println("玩家4:\n"+list4.size()+sortPoker(list4));


	}

	public static ArrayList<Poker> sortPoker(ArrayList<Poker> list){
		list.sort(new Comparator<Poker>() {
			@Override
			public int compare(Poker o1, Poker o2) {
				return o2.getId()-o1.getId();
			}
		});
		return list;
	}



}
