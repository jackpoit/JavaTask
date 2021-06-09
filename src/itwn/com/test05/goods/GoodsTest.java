package itwn.com.test05.goods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GoodsTest {
	public static void main(String[] args) {
		ArrayList<Goods> list=new ArrayList<>();
		list.add(new Goods(1,"苹果",30,99.89));
		list.add(new Goods(2,"香蕉",40,99.99));
		list.add(new Goods(3,"橙子",10,99.79));
		list.add(new Goods(4,"oq",10,99.89));
		list.add(new Goods(5,"qq",20,109.99));
		list.add(new Goods(6,"dd",30,99.79));
		System.out.println(list);
		list.sort(new Comparator<Goods>() {
			@Override
			public int compare(Goods o1, Goods o2) {
				return Double.compare(o1.getPrice(),o2.getPrice())==0?Integer.compare(o1.getNum(),o2.getNum()):Double.compare(o1.getPrice(),o2.getPrice());
			}
		});
		System.out.println(list);
	}
}
