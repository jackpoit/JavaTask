package itwn.com.homework.task0610;

import java.util.TreeSet;

public class Task02 {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		while (set.size()<10){
			int rnum=(int)(Math.random()*9000)+1000;
			set.add(rnum);
		}
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set);

	}
}
