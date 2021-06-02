package itwn.com.test01;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calendar ca=Calendar.getInstance();
		System.out.println("年");
		int year=sc.nextInt();
		System.out.println("月");
		int month=sc.nextInt();
		ca.set(year,month-1,1);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int week=ca.get(Calendar.DAY_OF_WEEK);
		for (int i=1;i<week;i++){
			System.out.print("\t");
		}
		for (int i=1;i<=ca.getActualMaximum(Calendar.DAY_OF_MONTH);i++){
			if (week%7==0){
				System.out.print(i+"\n");
			}else {
				System.out.print(i+"\t");
			}
			week++;
		}

//		for (int i=1;i<ca.get(Calendar.DAY_OF_WEEK);i++){
//			System.out.print("\t");
//		}
//		for (int i=1;i<=ca.getActualMaximum(Calendar.DAY_OF_MONTH);i++){
//			ca.set(Calendar.DAY_OF_MONTH,i);
//			if (ca.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
//				System.out.print(i+"\n");
//			}else {
//				System.out.print(i+"\t");
//			}
//		}
	}
}
