package itwn.com.exam.exam0619;

import java.util.TreeSet;

public class Task01 {
	public static void main(String[] args) {
//		1.要求产生50个不重复的随机四位数，并且对这些四位数进行顺序排列(10分)
		TreeSet<Integer> set=new TreeSet<>();
		while (set.size()<50){
			int rnum=(int)(Math.random()*9000)+1000;
			set.add(rnum);
		}
		System.out.println(set);

	}
}
