package itwn.com.homework.task0609.Order;

import java.util.Date;

public class Order {
	private int uid;
	private int pid;
	private double total;
	private Date createdTime;
	private Date finishTime;
	private int status;

	public Order() {
	}

	public Order(int uid, int pid, double total, Date createdTime, Date finishTime, int status) {
		this.uid = uid;
		this.pid = pid;
		this.total = total;
		this.createdTime = createdTime;
		this.finishTime = finishTime;
		this.status = status;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Order)) return false;

		Order order = (Order) o;

		if (uid != order.uid) return false;
		if (pid != order.pid) return false;
		if (Double.compare(order.total, total) != 0) return false;
		if (status != order.status) return false;
		if (createdTime != null ? !createdTime.equals(order.createdTime) : order.createdTime != null) return false;
		return finishTime != null ? finishTime.equals(order.finishTime) : order.finishTime == null;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = uid;
		result = 31 * result + pid;
		temp = Double.doubleToLongBits(total);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
		result = 31 * result + (finishTime != null ? finishTime.hashCode() : 0);
		result = 31 * result + status;
		return result;
	}

	@Override
	public String toString() {
		return "Order{" +
				"uid=" + uid +
				", pid=" + pid +
				", total=" + total +
				", createdTime=" + createdTime.toLocaleString() +
				", finishTime=" + finishTime.toLocaleString() +
				", status=" + status +
				'}'+"\n";
	}
}
