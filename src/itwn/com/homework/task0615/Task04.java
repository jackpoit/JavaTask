package itwn.com.homework.task0615;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;

public class Task04 {
	public static void main(String[] args) throws IOException {
		List<User> list=new LinkedList<>();
		list.add(new User("jack","172634843",100));
		list.add(new User("rose","13464843",300));
		list.add(new User("tina","1727763",200));
		list.add(new User("marry","17345667843",1100));
		list.add(new User("harry","17262353",1002));
		list.add(new User("potter","172113843",1020));

		String strs="";
		for (User user:list){
			strs+=user.toString()+"\n";
		}
		OutputStream out=new FileOutputStream("file/user.txt");
		out.write(strs.getBytes());
		OutputStream out1=new FileOutputStream("file/user.csv");
		out1.write(strs.getBytes());
		out.close();
		out1.close();



	}

	static class User {
		private int id;
		private String userName;
		private String userPass;
		private String userPhone;
		private int money;
		private static int count=0;

		public User() {
		}
		public User(String name, String userPhone,int money) {
			this.id = ++count;
			this.userName = name;
			this.userPass = userPhone.substring(userPhone.length()-6);
			this.userPhone = userPhone;
			this.money = money;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return userName;
		}

		public void setName(String name) {
			userName = name;
		}

		public String getUserPass() {
			return userPass;
		}

		public void setUserPass(String userPass) {
			this.userPass = userPass;
		}

		public String getUserPhone() {
			return userPhone;
		}

		public void setUserPhone(String userPhone) {
			this.userPhone = userPhone;
		}

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		@Override
		public String toString() {
			return id+","+userName+","+userPass+","+userPhone+","+money;

		}
	}

}
