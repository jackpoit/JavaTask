package itwn.com.test01;

import java.text.ParseException;
import java.util.Date;

public class CountDown {
	public static void main(String[] args)  {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Date date1 = new Date();
//			String date1001 = "2021-10-01 00:00:00";
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			Date date2 = sdf.parse(date1001);
			Date date2=new Date(2021-1900, 9,1);
			long temp = (date2.getTime() - date1.getTime()) / 1000;
//			long second = temp % 60;
//			long minute = temp / 60 % 60;
//			long hour = temp / 3600 % 24;
//			long days = temp / 3600 / 24;
			long days=temp/(3600*24);
			long hour=temp%(3600*24)/3600;
			long minute=temp%3600/60;
			long second=temp%60;
			System.out.printf("倒计时%d天%d小时%d分钟%d秒钟\n", days, hour, minute, second);
		}
	}
}
