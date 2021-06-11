package itwn.com.homework.task0610;

import java.util.*;
import java.util.Map.Entry;

public class RandNumTest {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		//不能用TreeMap TreeMap 自定义比较器只能比较key
		for (int i=0;i<30;i++){
			int rnum=(int) (Math.random()*10)+90;
			if (map.containsKey(rnum)){
				map.put(rnum,map.get(rnum)+1);
			}else {
				map.put(rnum,1);
			}
		}
		Set<Entry<Integer,Integer>> set=map.entrySet();
		TreeSet<Entry<Integer,Integer>> treeSet=new TreeSet<>(new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return Integer.compare(o1.getValue(),o2.getValue());
			}
		});
		treeSet.addAll(set);
		System.out.println(treeSet);

	}
}
