package itwn.com.homework.task0602;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class CurrencyFormate {
	public static void main(String[] args) {
		String str="1123456789";
 	StringBuilder sb=new StringBuilder(str);
		int index=sb.length()-3;
		while (index>0){
			sb.insert(index,",");
			index-=3;
		}
		System.out.println(sb);


	}
}
