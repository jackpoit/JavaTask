package itwn.com.homework.task0608;

import java.util.ArrayList;

public class LuckSystem<T> {
	private ArrayList<T> list=new ArrayList<>();

	public void add(T product){
		list.add(product);
	}

	public T getLucker(){
		int num=(int)(Math.random()*list.size());
		return list.get(num);
	}



}
