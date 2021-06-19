package itwn.com.test.test03;

import itwn.com.homework.task0610.atm.User;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {

			new Generic<String>(){   //  菱形括号里的string 必须要加

			@Override
			public <K> K test(K k) {
				return null;
			}
		};



		MyMapIner<Integer,String> myMapIner=new MyMapIner<>();


	}

}
