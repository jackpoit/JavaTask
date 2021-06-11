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
	public void queryAllUser(){
		Set<Map.Entry<String,User>> set=map.entrySet();
		for (Map.Entry<String,User> e:set){
			String str="User{" +
					"id=" + e.getValue().getId() +
					", userNo='" + e.getValue().getUserNo() + '\'' +
					", userName='" + e.getValue().getUserName() + '\'' +
					", userPass='" + "******" + '\'' +
					", userPhone='" + e.getValue().getUserPhone().substring(0,8)+"****" + '\'' +
					", money=" + e.getValue().getMoney() +
					'}'+"\n";
			System.out.print(str);
		}
	}

	//查看个人信息
	public String queryUser(String key){
		return map.get(key).toString();
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

	//存钱
	public boolean savaMoney(String key,double money){
		if (money%100==0&&money>0){
			User temp=map.get(key);
			temp.setMoney(temp.getMoney()+money);
			return true ;
		}else {
			return false;
		}
	}
	//取钱
	public boolean getUserMoney(String key,double money){
		User temp=map.get(key);
		double saved=temp.getMoney();
		if (money%100==0&&money>0&&saved>=money){
			temp.setMoney(temp.getMoney()-money);
			return true;
		}else {
			return false;
		}
	}
	//转账
	public boolean transMoney(String key,double money,String transUser){
		if (getUserMoney(key,money)){
			savaMoney(transUser,money);
			return true;
		}
		return false;
	}


	public LinkedHashMap<String, User> getMap() {
		return map;
	}

	public void setMap(LinkedHashMap<String, User> map) {
		this.map = map;
	}


}
