package itwn.com.homework.task0610.student;

import java.util.*;

public class StudentTest {
	public static void main(String[] args) {
		LinkedList<Student> list=new LinkedList<>();
		list.add(new Student(50,"tina",5555.89));
		list.add(new Student(98,"rouse",4050.88));
		list.add(new Student(78,"jack",6050.88));
		list.add(new Student(68,"charles",7050.88));
		list.add(new Student(50,"marry",5555.88));
		list.add(new Student(88,"lory",5555.98));

		list.get(0).setScore(88);
		list.get(2).setScore(98);
		System.out.println(list);
		list.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getScore()-o2.getScore();
			}
		});

		list.removeFirst();
		System.out.println(list);

		TreeSet<Student> set=new TreeSet<>(new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getScore()==o2.getScore()?Double.compare(o1.getFee(),o2.getFee()):Integer.compare(o2.getScore(),o1.getScore());
			}
		});
		set.addAll(list);
		System.out.println(set);
	}
}
