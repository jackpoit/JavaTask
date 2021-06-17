package itwn.com.test.test05.Student01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StuTest {
	public static void main(String[] args) {

		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(1,"jack",12));
		list.add(new Student(2,"jeff",33));
		list.add(new Student(3,"tom",22));
		list.add(new Student(4,"yummy",99));
		list.add(new Student(5,"mary",22));

		Comparator<Student> studentComparator=new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getScore()-o2.getScore();
			}
		};

		System.out.println(list);
		Collections.sort(list, studentComparator);
//		list.sort(new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getScore() - o2.getScore();
//			}
//		});
		System.out.println(list);

	}
}
