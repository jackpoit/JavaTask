package itwn.com.homework.task0610.useraccount;

public class User {
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
		if (userNo.matches(ATMUtil.strRegexs[0][1])) {
			this.userNo = userNo;
		}else {
			throw new IllegalInputException(ATMUtil.strRegexs[0][2]);
		}
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) throws IllegalInputException {
		if (userPass.matches(ATMUtil.strRegexs[1][1])) {
			this.userPass = userPass;
		}else {
			throw new IllegalInputException(ATMUtil.strRegexs[1][2]);
		}
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) throws IllegalInputException {
		if (userPhone.matches(ATMUtil.strRegexs[2][1])) {
			this.userPhone = userPhone;
		}else {
			throw new IllegalInputException(ATMUtil.strRegexs[2][2]);
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
