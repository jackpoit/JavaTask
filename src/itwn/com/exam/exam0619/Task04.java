package itwn.com.exam.exam0619;

import java.util.*;

public class Task04 {
	public static void main(String[] args) {
//		使用Scanner从键盘输入任意内容，统计这个字符串由多少种符号组成，并统计每个字符出现的次
//	数,还要求按照出现的次数降序排列，如果次数相同按照字符的值进行顺序排列
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入：");
		String str=scanner.next();
		Map<Character,Integer> map=new LinkedHashMap<>();
		for (int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if (map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		System.out.println("由"+map.size()+"种符号组成");
		Set<Map.Entry<Character,Integer>> set=map.entrySet();
		List<Map.Entry<Character,Integer>> list=new LinkedList<>(set);
		list.sort(new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				if (o1.getValue()==o2.getValue()){
					return o1.getKey().compareTo(o2.getKey());
				}
				return o2.getValue()-o1.getValue();
			}
		});

		for (Map.Entry<Character, Integer> e:list){
			System.out.println(e);
		}
	}

}
