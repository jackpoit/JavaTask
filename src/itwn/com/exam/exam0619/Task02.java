package itwn.com.exam.exam0619;

import java.util.*;

public class Task02 {
	public static void main(String[] args) {
//		2.String[] names={“charles”, “tina”,“jack”, “frank”,“charles”,“tina”, “charles”}
//		将数组中的数据存入集合，要求删除所有的charles元素然后再遍历。 （10分）
		String[] names={"charles", "tina","jack", "frank","charles","tina", "charles"};
		List<String> list=new LinkedList<>(Arrays.asList(names));
		while (list.contains("charles")){
			list.remove("charles");
		}
		for (String s:list){
			System.out.println(s);
		}

	}
}
