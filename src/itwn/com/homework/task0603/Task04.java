package itwn.com.homework.task0603;

import java.util.Calendar;
import java.util.Date;

public class Task04 {
	public static void main(String[] args) {
		Date deadline=new Date(2021-1900,9,1);

		while (true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Date now=new Date();
			long time=(deadline.getTime()-now.getTime())/1000;
			long hours=time/3600;
			long minutes=time%3600/60;
			long seconds=time%60;
			System.out.printf("倒计时%d小时%d分%d秒\n",hours,minutes,seconds);


		}

	}
}
