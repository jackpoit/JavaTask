package itwn.com.homework.task0609;

import java.util.ArrayList;
import java.util.Collections;

public class Task02 {
	public static void main(String[] args) {
		ArrayList<Double> list=new ArrayList<>();

		list.add(65D);
		list.add(23D);
		list.add(234D);
		list.add(54D);
		list.add(33D);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		list.remove(Collections.max(list));
		list.remove(Collections.min(list));
		System.out.println(list);
		Double sum=0D;
		for (Double i:list){
			sum+=i;
		}

		System.out.println(sum/list.size());









	}
}
