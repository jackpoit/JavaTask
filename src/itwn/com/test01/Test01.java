package itwn.com.test01;

import javax.xml.crypto.Data;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class Test01 {
	public static void main(String[] args) {
		String str="我";
		byte[] bs=str.getBytes();
		System.out.println(Arrays.toString(bs));
		String str1=new String(new char[]{'1','2','c'});
		System.out.println(str1);
	}
}
