package itwn.com.homework.task0609;

import java.util.ArrayList;

public class Task04 {
	public static void main(String[] args) {
		String[] strs=new String[]{"jack","charles","jack","charles","jack","charles","rouse","rouse"};
		ArrayList<String> list=new ArrayList<>();
		for (int i=0;i<strs.length;i++){
			if (!list.contains(strs[i])){
				list.add(strs[i]);
			}
		}
		for (String a:list){
			int count=0;
			for (String s:strs){
				if (s.equals(a))
					count++;
			}
			System.out.println(a+"出现的次数为"+count);
		}

	}
}
