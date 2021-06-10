package itwn.com.test06;

import java.util.Arrays;
import java.util.HashSet;

public class Test02 {
	public static void main(String[] args) {
		String str="qgdsasdgq";
		char[] chars=str.toCharArray();
//		HashSet<Character> set=new HashSet<>(Arrays.asList(chars));
		HashSet<Character> set=new HashSet<>();


		for (char c:str.toCharArray()){
			set.add(c);
		}
		System.out.println(set.size());
		for (char c:set){
			int count=0;
			for (char d:str.toCharArray()){
				if (d==c){
					count++;
				}
			}
			System.out.println(c+"出现的次数："+count);

		}

	}
}
