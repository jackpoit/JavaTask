package itwn.com.homework.task0604.ordersystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BuyUserDAO {
	private MyArrayList<BuyUser> usersList=new MyArrayList<>();
	//检查用户名是否存在 返回用户对象
	public BuyUser nameCheck(String name) {
		for (int i = 0; i < usersList.size(); i++) {
			BuyUser temp = usersList.get(i);
			if (name.equals(temp.getUserAccount())) {
				return temp;
			}
		}
		return null;
	}
	//注册
	public int register(BuyUser buyUser){
		if (nameCheck(buyUser.getUserAccount())==null){
			usersList.addLast(buyUser);
			return 1;
		}else {
			return 0;
		}
	}
	//查询用户信息
	public void queryAllUser(){
		if (usersList.size()==0){
			System.out.println("没有用户");
		}else {
			for (int i = 0; i < usersList.size(); i++) {
				System.out.println(usersList.get(i));
			}
		}
	}

	//查询用户全部订单
	public void queryAllOrder(String account){
		BuyUser temp=nameCheck(account);
		if (temp.getUserOrders().size()==0){
			System.out.println("没有订单");
		}else {
			for (int i=0;i<temp.getUserOrders().size();i++){
				System.out.println(temp.getUserOrders().get(i));
			}
		}
	}
	//添加用户订单
	public int addOrder(double money,int status,String account)  {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		Date now=new Date();
		String id=sdf.format(now);
//		SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMMdd");
//		Date startTime1= null;
//		try {
//			startTime1 = sdf1.parse(startTime);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		Date endTime= new Date(2077-1900,0,1);
//		try {
//			endTime1 = sdf1.parse(endTime);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		nameCheck(account).getUserOrders().addLast(new Order(id,now,endTime,money,status));
		return 1;
	}

	//根据id查找订单
	public int idCheck(String id,String account){
		int index=-1;
		MyArrayList<Order> temp=nameCheck(account).getUserOrders();
		for (int i=0;i<temp.size();i++){
			Order order=temp.get(i);
			if (order.getId().equals(id)){
				index=i;
				break;
			}
		}
		return index;
	}
	//修改status
	public int modifyOrder(int i,String account){
	 	Order temp=nameCheck(account).getUserOrders().get(i);
	 	if (temp.getStatus()==2){
	 		return 0;
		 }else {
	 		temp.setStatus(2);
	 		temp.setEndTime(new Date());
	 		return 1;
	 	}
	}

	//删除订单
	public int removeOrder(int i,String account){
		Order temp= nameCheck(account).getUserOrders().get(i);
		if (temp.getStatus()==2){
			nameCheck(account).getUserOrders().remove(i);
			return 1;
		}else {
			return 0;
		}
	}
	public int sortOrder(String account){
		MyArrayList<Order> list=nameCheck(account).getUserOrders();
		for (int i=1;i<list.size();i++){
			for (int j=0;j< list.size()-i;j++){
//				Order order01=(Order) list.get(j);
//				Order order02=(Order) list.get(j+1);
//				if (order01.getStartTime().after(order02.getStartTime())){
//					list.swap(j,j+1);
//				}
				if (list.get(j).getStartTime().before(list.get(j+1).getStartTime())){
					list.swap(j,j+1);
				}
			}
		}
			return 1;
	}
}
