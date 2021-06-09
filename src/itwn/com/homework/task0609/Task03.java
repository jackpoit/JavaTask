package itwn.com.homework.task0609;

import java.util.ArrayList;

public class Task03 {
	public static void main(String[] args) {
		String str="rqwasferwqtgreqqwezxdasg";
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
