package itwn.com.homework.task0610.useraccount;

public class User {
	private int id;
	private String userNo;
	private String userName;
	private String userPass;
	private String userPhone;
	private double money;
	private static int count;

	public User() {
	}

	public User(String userNo) {
		this(userNo,userNo,"123456","10086666666",10000);
	}

	public User(String userNo, String userName, String userPass, String userPhone, double money) {
		this.id = ++count;
		this.userNo = userNo;
		this.userName = userName;
		this.userPass = userPass;
		this.userPhone = userPhone;
		this.money = money;
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

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
		if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
		if (userPass != null ? !userPass.equals(user.userPass) : user.userPass != null) return false;
		return userPhone != null ? userPhone.equals(user.userPhone) : user.userPhone == null;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = id;
		result = 31 * result + (userNo != null ? userNo.hashCode() : 0);
		result = 31 * result + (userName != null ? userName.hashCode() : 0);
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
				", userName='" + userName + '\'' +
				", userPass='" + userPass + '\'' +
				", userPhone='" + userPhone + '\'' +
				", money=" + money +
				'}'+"\n";
	}
}
