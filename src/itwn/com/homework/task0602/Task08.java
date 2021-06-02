package itwn.com.homework.task0602;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Boolean depend=true;
		for (int i=0;i<str.length()/2;i++){
			if (str.charAt(i)!=str.charAt(str.length()-1-i)){
				depend=false;
			}
		}
		System.out.println(depend);
	}
}
