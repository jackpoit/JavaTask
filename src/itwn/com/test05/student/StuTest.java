package itwn.com.test05.student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class StuTest {
	public static void main(String[] args) {

		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(1,"jack",12));
		list.add(new Student(2,"jeff",33));
		list.add(new Student(3,"tom",22));
		list.add(new Student(4,"yummy",99));
		list.add(new Student(5,"mary",22));

		Student student1=new Student(1,"jack",12);
		System.out.println(list.indexOf(student1));

//		System.out.println(list.remove(student1));

		System.out.println(list.contains(new Student(5,"mary",22)));

		// indexOf  remove 底层都是用equals判断的  所以要重写equals&hashCode 不然equals就是默认比较地址
//		LinkedList

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}
}
