package itwn.com.homework.task0608.poker;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDao {
	private ArrayList<Poker> totalList=new ArrayList<>();
	private ArrayList<Poker> user1list=new ArrayList<>();
	private ArrayList<Poker> user2list=new ArrayList<>();
	private ArrayList<Poker> user3list=new ArrayList<>();

	//开牌
	public void newPoker(){
		String[] values={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] colors={"♣","♦","♥","♠"};
		for (int i=0;i<values.length;i++){
			for (int j=0;j<colors.length;j++){
				totalList.add(new Poker(values[i],colors[j]));
			}
		}
		totalList.add(new Poker("小王",""));
		totalList.add(new Poker("大王",""));

	}
	//洗牌
	public void shuffle(ArrayList<Poker> list,int count){
		for (int i=1;i<=count;i++){
			int rnum1=(int) (Math.random()*list.size());
			int rnum2=(int) (Math.random()*list.size());
			swapPoker(rnum1,rnum2,list);
			Collections.swap(list,rnum1,rnum2);
		}
	}
	//发牌
	public boolean givePoker(){
		if(getUser2list().size()>0){
			return false;
		}else {
			while (totalList.size()>3) {
				user1list.add(totalList.get(0));
				totalList.remove(0);
				user2list.add(totalList.get(0));
				totalList.remove(0);
				user3list.add(totalList.get(0));
				totalList.remove(0);
			}
			return true;
		}

	}
	//看牌
	public ArrayList<Poker> getPoker(ArrayList<Poker> checkList){
		return checkList;
	}
	//码牌
	public void sortPoker(ArrayList<Poker> list){
		for (int i=1;i<17;i++){
			for (int j=0;j<17-i;j++){
				if (list.get(j).getId()<list.get(j+1).getId()){
					swapPoker(j,j+1,list);
				}
			}
		}
	}
	public void swapPoker(int i,int j,ArrayList<Poker> list){
		Poker temp=list.get(i);
		list.set(i, list.get(j));
		list.set(j,temp);
	}

	public ArrayList<Poker> getTotalList() {
		return totalList;
	}

	public void setTotalList(ArrayList<Poker> totalList) {
		this.totalList = totalList;
	}

	public ArrayList<Poker> getUser1list() {
		return user1list;
	}

	public void setUser1list(ArrayList<Poker> user1list) {
		this.user1list = user1list;
	}

	public ArrayList<Poker> getUser2list() {
		return user2list;
	}

	public void setUser2list(ArrayList<Poker> user2list) {
		this.user2list = user2list;
	}

	public ArrayList<Poker> getUser3list() {
		return user3list;
	}

	public void setUser3list(ArrayList<Poker> user3list) {
		this.user3list = user3list;
	}
}
