package itwn.com.homework.task0603;

import java.text.NumberFormat;

public class Task06 {
	public static void main(String[] args) {
		//1、
		int num=100000000;
		NumberFormat nf=NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(num));

		System.out.println(trans(num));

	}
	public static String trans(int num){

		String str=String.valueOf(num);
		StringBuilder sb=new StringBuilder(str);
		int index=str.length()-3;
		while (index>0){
			sb.insert(index,",");
			index=index-3;
		}

		return "￥"+new String(sb);

	}
}
