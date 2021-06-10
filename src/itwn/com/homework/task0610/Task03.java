package itwn.com.homework.task0610;

import java.util.Locale;
import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] strs=new String[5];
		for (int i=0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"道题答案");
			strs[i]=scanner.next().toLowerCase();
		}
		String[] ans={"abc","bcd","ab","cd","abcd"};
		int count=100;
		for (int i=0;i<5;i++){
			boolean depend=true;
			for (char c:strs[i].toCharArray()){
				if (!ans[i].contains(c+"")){
					depend=false;
					break;
				}
				ans[i]=ans[i].replace(c+"","");
			}
			if (!depend){
				count-=20;
			}else {
				if (!ans[i].equals("")){
					count-=10;
				}
			}
		}
		System.out.println(count);
	}
}
