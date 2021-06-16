package itwn.com.homework.task0610.atm;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UserDAO {
	private LinkedHashMap<String,User> map;

	public UserDAO() {
		this.map = new LinkedHashMap<>();
		try {
			User user1=new User("jack","12345000001");
			map.put(user1.getUserNo(),user1);
		} catch (IllegalInputException e) {
			e.printStackTrace();
		}
		try {
			User user2=new User("rose","12345000002");
			map.put(user2.getUserNo(),user2);
		} catch (IllegalInputException e) {
			e.printStackTrace();
		}
		try {
			User user3=new User("tina","12345000000");
			map.put(user3.getUserNo(),user3);
		} catch (IllegalInputException e) {
			e.printStackTrace();
		}
	}


	//注册
	public boolean register(User user)  {
		if (!map.containsKey(user.getUserNo())) {
			map.put(user.getUserNo(), user);
			return true;
		}
		return false;
	}
	//登录
	public int login(String userNo,String userPass){
		if (!map.containsKey(userNo)){
			return -1;
		}else {
			if (map.get(userNo).getStatus() == 1) {
				return -2;
			}
			if (map.get(userNo).getUserPass().equals(userPass)) {
				return 1;
			}
		}
		return 0;
	}
	//查看
	public void queryAllUser(){
		Set<Map.Entry<String,User>> set=map.entrySet();
		System.out.println("编号\t账号\t密码\t手机号\t\t\t金额\t状态");
		for (Map.Entry<String,User> e:set){
			String str= e.getValue().getId() +"\t"+
					 e.getValue().getUserNo() + "\t"+
					 "******" + "\t" +
					e.getValue().getUserPhone().substring(0,3)+"****"
					+e.getValue().getUserPhone().substring(7,11)+ "\t\t" +
					 e.getValue().getMoney() +"\t\t" +
					 (e.getValue().getStatus()==0?"正常":"异常")+ "\n";
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
	public void modifyPass(String userNo,String userPass) throws IllegalInputException {
		User temp=map.get(userNo);
		temp.setUserPass(userPass);

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
		if (money%100==0&&money>0&&temp.getMoney()>=money){
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
