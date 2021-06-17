package itwn.com.test.file01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test09 implements Serializable {
	//serialVersionUID 很重要 ！！！！！
	private static final long serialVersionUID = 4359709211352400087L;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<User> list=new ArrayList<>();
		list.add(new Test09().new User(100,1));
		list.add(new Test09().new User(200,2));
		list.add(new Test09().new User(400,4));
		list.add(new Test09().new User(300,6));
		list.add(new Test09().new User(500,5));
//		list.add(new User(100,1));
//		list.add(new User(200,2));
//		list.add(new User(400,4));
//		list.add(new User(300,6));
//		list.add(new User(500,5));

		String path="file/users.txt";
//		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(path,true));
//		out.writeObject(list);
//		out.close();

		ObjectInputStream in =new ObjectInputStream(new FileInputStream(path));
			List<User> list1 = (List<User>) in.readObject();
			System.out.println(list1);

		in.close();

	}
	   class User implements Serializable{
		private static final long serialVersionUID = 4359709211352400087L;
		public int salary;
		public int id;
		public User(){}
		public User(int salary, int id) {
			this.salary = salary;
			this.id = id;
		}
		 @Override
		 public String toString() {
			 return "User{" +
					 "salary=" + salary +
					 ", id=" + id +
					 '}';
		 }
	 }
}
