package itwn.com.homework.task0604.ordersystem;

public class BuyUser {
	private int userID;
	private static int count;
	private String userAccount;
	private String userPass;
	private String userPhone;
	private String userEmail;
	private MyArrayList<Order> userOrders;

	public BuyUser() {
	}
	public BuyUser(String userAccount, String userPass, String userPhone, String userEmail) {
		this.userID=++count;
		this.userAccount = userAccount;
		this.userPass = userPass;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userOrders=new MyArrayList<>();
	}
	public MyArrayList<Order> getUserOrders() {
		return userOrders;
	}

	public void setUserOrders(MyArrayList<Order> userOrders) {
		this.userOrders = userOrders;
	}
	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "BuyUser{" +
				"userID=" + userID +
				", userAccount='" + userAccount + '\'' +
				", userPass='" + userPass + '\'' +
				", userPhone='" + userPhone + '\'' +
				", userEmail='" + userEmail + '\'' +
				'}';
	}
}
