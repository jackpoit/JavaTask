package itwn.com.homework.task0603;

import java.util.Calendar;
import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("年：");
		int year=sc.nextInt();
		System.out.println("月：");
		int month=sc.nextInt();
		Calendar calendar=Calendar.getInstance();
		calendar.set(year,month-1,1);
		int week=calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for (int i=1;i<week;i++){
			System.out.print("\t");
		}
		for (int i=1;i<calendar.getActualMaximum(Calendar.DAY_OF_MONTH);i++){
			if (week%7==0){
				System.out.print(i+"\n");
			}else {
				System.out.print(i+"\t");
			}
			week++;
		}
	}
}
