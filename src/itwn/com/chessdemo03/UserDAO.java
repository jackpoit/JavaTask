package itwn.com.chessdemo03;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class UserDAO {
	private Map<String,User> map;
	private final static String FILE_PATH="file/chessUser.txt";
	{
		if (new File(FILE_PATH).exists()){
				map=readMap();
		}else {
			map=new LinkedHashMap<>();
			User user1=new User("u0001", "1234","111");
			User user2=new User("u0002", "1234","112");
			User user3=new User("u0003", "1234","113");
			map.put(user1.getUserNo(), user1);
			map.put(user2.getUserNo(), user2);
			map.put(user3.getUserNo(), user3);
			writeMap();

		}
	}
	public void writeMap(){
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			out.writeObject(map);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Map<String,User> readMap() {
		Map<String,User> res;
		try {
			ObjectInputStream in= new ObjectInputStream(new FileInputStream(FILE_PATH));
			res= (Map<String, User>) in.readObject();
			in.close();
			return res;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean register(String userNo,String userPass,String userPhone){
		if (map.containsKey(userNo)){
			return false;
		}else {
			User user=new User(userNo,userPass,userPhone);
			map.put(userNo,user);
			writeMap();
			return true;
		}
	}
	public boolean login(String userNo,String userPass){
		if (map.containsKey(userNo)){
			return map.get(userNo).getUserPass().equals(userPass);
		}
		return false;
	}

}
