package itwn.com.aslisttest.mynum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyNumTest {
	public static void main(String[] args) {
		List<MyNum> list = new ArrayList<MyNum>();
		for (int i=0;i<50;i++){
			int rnum=(int) (Math.random()*10)+90;
			MyNum mynum=getNum(list,rnum);
			if (mynum==null){
				list.add(new MyNum(rnum,1));
			}else {
				mynum.setCount(mynum.getCount()+1);
			}
		}
		list.sort(new Comparator<MyNum>() {
			@Override
			public int compare(MyNum o1, MyNum o2) {
				if (o1.getCount()==o2.getCount()){
					return o1.getNum()-o2.getNum();
				}
					return o1.getCount()- o2.getCount();

			}
		});
		System.out.println(list);

	}
	public static MyNum getNum(List<MyNum> list,int num){
		for (MyNum e:list){
			if (e.getNum()==num){
				return e;
			}
		}
		return null;
	}
}
