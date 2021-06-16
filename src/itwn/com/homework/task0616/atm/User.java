package itwn.com.homework.task0616.atm;

import java.io.Serializable;

public class User implements Serializable {
	private int id;
	private String userNo;
	private String userPass;
	private String userPhone;
	private double money;
	private int status;
	private static int count=1000;


	public User() {
	}
	public User(String userNo, String userPhone) throws IllegalInputException {
		this.id = ++count;
		setUserNo(userNo);
		this.userPass = userPhone.substring(userPhone.length()-6);
		setUserPhone(userPhone);
		this.money = 0;
		this.status=0;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) throws IllegalInputException {
		if (userNo.matches(ATMUtil.USER_NO_REGEX)) {
			this.userNo = userNo;
		}else {
			throw new IllegalInputException("由3-6位的数字，字母组成，首位不能是数字");
		}
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) throws IllegalInputException {
		if (userPass.matches(ATMUtil.USER_PASS_REGEX)) {
			this.userPass = userPass;
		}else {
			throw new IllegalInputException("由6位数字组成");
		}
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) throws IllegalInputException {
		if (userPhone.matches(ATMUtil.USER_PHONE_REGEX)) {
			this.userPhone = userPhone;
		}else {
			throw new IllegalInputException("首位是1 后面由10个数字组成");
		}
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;

		User user = (User) o;

		if (id != user.id) return false;
		if (Double.compare(user.money, money) != 0) return false;
		if (userNo != null ? !userNo.equals(user.userNo) : user.userNo != null) return false;
		if (userPass != null ? !userPass.equals(user.userPass) : user.userPass != null) return false;
		return userPhone != null ? userPhone.equals(user.userPhone) : user.userPhone == null;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = id;
		result = 31 * result + (userNo != null ? userNo.hashCode() : 0);
		result = 31 * result + (userPass != null ? userPass.hashCode() : 0);
		result = 31 * result + (userPhone != null ? userPhone.hashCode() : 0);
		temp = Double.doubleToLongBits(money);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userNo='" + userNo + '\'' +
				", userPass='" + userPass + '\'' +
				", userPhone='" + userPhone + '\'' +
				", money=" + money +
				", status=" + status +
				'}'+"\n";
	}
}
