package itwn.com.homework.task0609.employee1;

import java.util.ArrayList;
import java.util.Comparator;

public class Test01 {
	public static void main(String[] args) {
		ArrayList<Employee01> list=new ArrayList<>();
		list.add(new Employee01(5,"yyyy",10000));
		list.add(new Employee01(1,"tttt",33000));
		list.add(new Employee01(3,"qqqq",4000));
		list.add(new Employee01(4,"rrrr",40000));
		list.add(new Employee01(5,"sss",44000));
		list.add(new Employee01(3,"rose",20000));

		System.out.println(list);

		list.sort(new Comparator<Employee01>() {
			@Override
			public int compare(Employee01 o1, Employee01 o2) {
				return o1.getNum()-o2.getNum()==0?Double.compare(o1.getSalary(), o2.getSalary()):Integer.compare(o1.getNum(),o2.getNum());
			}
		});

		System.out.println(list);
	}
}
