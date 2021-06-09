package itwn.com.homework.task0609.Order;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class OrderTest {
	public static void main(String[] args) {
		ArrayList<Order> list = new ArrayList<>();
		list.add(new Order(1, 3, 300, new Date(101, 1, 12), new Date(103, 7, 2), 2));
		list.add(new Order(2, 4, 400, new Date(101, 0, 22), new Date(103, 8, 12), 1));
		list.add(new Order(3, 1, 100, new Date(101, 4, 12), new Date(103, 3, 23), 0));
		list.add(new Order(4, 2, 200, new Date(101, 4, 22), new Date(103, 4, 25), 1));
		list.add(new Order(5, 2, 300, new Date(101, 4, 12), new Date(103, 5, 12), 0));
		list.add(new Order(8, 4, 500, new Date(101, 4, 21), new Date(103, 4, 22), 1));
		list.add(new Order(65, 121, 600, new Date(101, 4, 12), new Date(103, 2, 22), 3));
		list.add(new Order(2, 5, 200, new Date(101, 5, 30), new Date(103, 3, 22), 1));
		list.add(new Order(3, 3, 500, new Date(101, 8, 1), new Date(103, 5, 22), 1));
		list.add(new Order(2, 5, 200, new Date(101, 5, 30), new Date(103, 3, 22), 1));

		System.out.println(list);
		ArrayList<Order> newList = new ArrayList<>();
		for (Order e : list) {
			if (!newList.contains(e)) {
				newList.add(e);
			}
		}
		list=newList;
		System.out.println("去重:\n"+list);

		list.sort(new Comparator<Order>() {
			@Override
			public int compare(Order o1, Order o2) {
				return Double.compare(o2.getTotal(),o1.getTotal());
			}
		});
		System.out.println("总价排序：\n"+list);

		list.sort(new Comparator<Order>() {
			@Override
			public int compare(Order o1, Order o2) {
				if (o1.getCreatedTime().after(o2.getCreatedTime())){
					return 1;
				}else if (o1.getCreatedTime().before(o2.getCreatedTime())){
					return -1;
				}else {
					return 0;
				}
			}
		});
		System.out.println("时间升序：\n"+list);

		ArrayList<Order> list1 = new ArrayList<>();
		for (Order e:list){
			if (e.getStatus()==1){
				list1.add(e);
			}
			if (list1.size()==3){
				break;
			}
		}
		System.out.println("发货:\n"+list1);

	}
}
