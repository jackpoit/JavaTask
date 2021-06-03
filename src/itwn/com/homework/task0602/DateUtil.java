package itwn.com.homework.task0602;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static boolean isLeapYear(int year){
        return (year%4==0&&year%100!=0)||year%400==0;
    }
    public static int differYear(String caStr1,String caStr2,String pattern) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date date1=sdf.parse(caStr1);
        Date date2=sdf.parse(caStr2);
        //long temp=(date1.after(date2)?date1.getTime()-date2.getTime():date2.getTime()-date1.getTime())/1000;
        return date1.after(date2)?date1.getYear()-date2.getYear():date2.getYear()-date1.getYear();

    }
    public static int differMonth(String caStr1,String caStr2,String pattern) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date date1=sdf.parse(caStr1);
        Date date2=sdf.parse(caStr2);
        long temp=(date1.after(date2)?date1.getTime()-date2.getTime():date2.getTime()-date1.getTime())/1000;
        return (int)(temp/(3600*24*30));
    }
    public static int differDay(String caStr1,String caStr2,String pattern) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date date1=sdf.parse(caStr1);
        Date date2=sdf.parse(caStr2);
        long temp=(date1.after(date2)?date1.getTime()-date2.getTime():date2.getTime()-date1.getTime())/1000;
        return (int)(temp/(3600*24));
    }
    public static int getAgeByDate(Date date){
        Date now=new Date();
        return now.getYear()-date.getYear();
    }
    public static void printCalendar(int year,int month){
        Calendar ca=Calendar.getInstance();
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

    }
}
