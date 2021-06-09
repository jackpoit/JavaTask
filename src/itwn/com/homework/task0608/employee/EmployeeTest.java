package itwn.com.homework.task0608.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeTest {
	private static ArrayList<Employee> list=new ArrayList<>();
	private static MyArrayList<Employee> list01=new MyArrayList<>();
	public static void main(String[] args) {

		list.add(new Employee("jack1","10001","10086"));
		list.add(new Employee("jack2","10002","10087"));
		list.add(new Employee("jack3","10003","10088"));
		list.add(new Employee("jack4","10004","10089"));
		list.add(new Employee("jack5","10005","10080"));


		list01.addLast(new Employee("jack1","10001","10086"));
		list01.addLast(new Employee("jack2","10002","10087"));
		list01.addLast(new Employee("jack3","10003","10088"));
		list01.addLast(new Employee("jack4","10004","10089"));
		list01.addLast(new Employee("jack5","10005","10080"));

//		for (Employee e: list01){
//			System.out.println(e);
//		}

//		//1
//		for (int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
//		//2
//		System.out.println("-----------------\n\n\n");
//		for (Employee e:list){
//			System.out.println(e);
//		}
//		//3
//		System.out.println("-----------------\n\n\n");
//		Iterator<Employee> it=  list.iterator();
//		while (it.hasNext()){
//			System.out.println(it.next());
//		}
//
//		list.get(2).setName("李小龙");
//		list.get(2).setSalary("10000");
//		list.get(3).setName("李连杰");
//		list.get(3).setSalary("8000");


	}

	public static Employee getMessage(int id){
		for (Employee e:list){
			if (e.getId()==id){
				return e;
			}
		}
		return null;
	}
	public static int remove(int id){
		for (Employee e:list){
			if (e.getId()==id){
				list.remove(e);
				return 1;
			}
		}
		return 0;
	}
	public static boolean find(int id){
		for (Employee e:list){
			if (e.getId()==id){
				return true;
			}
		}
		return false;
	}


}
