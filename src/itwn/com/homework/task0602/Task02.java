package itwn.com.homework.task0602;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入：");
		String input=sc.nextLine();
		char[] ss=input.toCharArray();
		int[] nums=new int[5];
		for (int i=0;i<input.length();i++){
			char n=input.charAt(i);
			if (('a'<=n&&n<='z')||(n>='A'&&n<='Z')){
				nums[0]++;
			}else if (n>='0'&&n<='9'){
				nums[1]++;
			}else if(n>=0x4e00&&n<=0x9fa5){
				nums[2]++;
			}else if(n==' '){
				nums[3]++;
			}else {
				nums[4]++;
			}
		}
		System.out.printf("%d个字母,%d个数字，%d个汉字，%d个空格，%d个其他符号",nums[0],nums[1],nums[2],nums[3],nums[4]);
	}
}
