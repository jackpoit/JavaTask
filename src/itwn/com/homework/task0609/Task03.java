package itwn.com.homework.task0609;

import com.sun.deploy.util.ArrayUtil;
import javafx.print.Collation;

import java.util.*;

public class Task03 {
	public static void main(String[] args) {



		String str="rqwasferwqtgreqqwezxdasg";
//		char[] c=str.toCharArray();
		String[] c={"a","b","c"};
		List<String> s=Arrays.asList(c);
//		ArrayList<String> s=new ArrayList<>(Arrays.asList(c));
		System.out.println(s);
		Collections.addAll(s,c);
		s.addAll(Arrays.asList(c));
		ArrayList<String> strList=new ArrayList<>();
		for (int i=0;i<str.length();i++){
			if (!strList.contains(str.charAt(i)+"")) {
				strList.add(str.charAt(i) + "");
			}
		}
		System.out.println(str);
		System.out.println(strList);
	}
}
