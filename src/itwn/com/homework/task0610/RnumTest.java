package itwn.com.homework.task0610;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RnumTest {
	public static void main(String[] args) {
		List<Mynum> list=new ArrayList<>();
		for (int i=0;i<30;i++){
			int rnum=(int) (Math.random()*10)+90;
			Mynum mynum=getNum(list,rnum);
			if (mynum==null){
				list.add(new Mynum(rnum,1));
			}
		}
		list.sort(new Comparator<Mynum>() {
			@Override
			public int compare(Mynum o1, Mynum o2) {
				return o2.count-o1.count;
			}
		});
		System.out.println(list);





	}
	public static Mynum getNum(List<Mynum> list,int num){
			for (Mynum e:list){
				if (e.num==num){
					e.count++;
					return e;
				}
			}
			return null;

	}
	static class Mynum{
		private int num;
		private int count;

		public Mynum() {
		}

		public Mynum(int num, int count) {
			this.num = num;
			this.count = count;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public String toString() {
			return "Mynum{" +
					"num=" + num +
					", count=" + count +
					'}'+"\n";
		}
	}
}
