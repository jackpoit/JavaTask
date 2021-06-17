package itwn.com.test.test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws ParseException {
		Date date2=new Date();
		String dateBirth="1994-11-27 00:00:00";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1=sdf.parse(dateBirth);
		long time1=date1.getTime();
		long time2=date2.getTime();
		long temp=time2-time1;
		System.out.println("年龄为"+temp/1000/60/60/24/365);
	}
}
