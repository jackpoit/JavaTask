package itwn.com.homework.task0604.ordersystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	private String id;
	private Date startTime;//下单时间
	private Date endTime; //完成订单时间
	private double money;
	private int status; //1 已付款 2 已收货

	public Order() {
	}

	public Order(String id, Date startTime, Date endTime, double money,int status) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.money = money;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String startTimeStr=sdf.format(startTime);
		String endTimeStr=sdf.format(endTime);

		return "Order{" +
				"id='" + id + '\'' +
				", startTime='" + startTimeStr + '\'' +
				", endTime='" + endTimeStr + '\'' +
				", money=" + money +
				", status=" + status +
				'}';
	}
}
