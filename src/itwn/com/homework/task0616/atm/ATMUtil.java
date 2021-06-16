package itwn.com.homework.task0616.atm;


import java.io.*;

public class ATMUtil {

	public static final String USER_NO_REGEX="^[a-zA-Z][a-zA-Z0-9]{2,5}$";
	public static final String USER_PASS_REGEX="^[0-9]{6}$";
	public static final String USER_PHONE_REGEX="^1[0-9]{10}$";
	public static final String USER_PATH="file/user.txt";
	//登录输出
	public static String view(String...strs){
		String res="******************\n";
		for (int i=1;i<=strs.length;i++){
			res+=i+"."+strs[i-1]+"\n";
		}
		res+="******************\n请输入选项：";
		return res;
	}
	public static Object readObj() throws IOException, ClassNotFoundException {
		ObjectInputStream in =new ObjectInputStream(new FileInputStream(USER_PATH));
		return in.readObject();
	}
	public static void writeObj(Object obj) throws IOException {
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(USER_PATH));
		out.writeObject(obj);
		out.close();
	}



}
