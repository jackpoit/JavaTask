package itwn.com.homework.task0610.useraccount;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UserDAO {
	private LinkedHashMap<String,User> map;

	public UserDAO() {
		this.map = new LinkedHashMap<>();
	}


	//注册
	public boolean register(String userNo){
		if (!map.containsKey(userNo)) {
			map.put(userNo, new User(userNo));
			return true;
		}
		return false;
	}
	//登录
	public int login(String userNo,String userPass){
		if (!map.containsKey(userNo)){
			return -1;
		}else if (map.get(userNo).getUserPass().equals(userPass)){
			return 1;
		}
		return 0;
	}
	//查看
	public void queryUser(){
		Set<Map.Entry<String,User>> set=map.entrySet();
		for (Map.Entry<String,User> e:set){
			System.out.println(e.getValue());
		}
	}
	//
	public boolean nameCheck(String userNo){
		return map.containsKey(userNo);
	}
	//修改密码
	public boolean modifyPass(String userNo,String userPass) {
		User temp=map.get(userNo);
		if (temp.getUserPass().equals(userPass)){
			return false;
		}else {
			temp.setUserPass(userPass);
			return true;
		}
	}
	public LinkedHashMap<String, User> getMap() {
		return map;
	}

	public void setMap(LinkedHashMap<String, User> map) {
		this.map = map;
	}


}
