package itwn.com.homework.task0610;

import java.util.Locale;
import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
//		求从控制台输入5道多选题的答案，不区分大小写 ，假设标准答案为[abc,bcd,ab,cd,abcd],每题20分，注意:学
//	生可能会将答案将abc=>acb 漏选扣一半分。
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
