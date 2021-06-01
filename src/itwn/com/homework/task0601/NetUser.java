package itwn.com.homework.task0601;

public class NetUser {
	int userId;
	String userPass;
	String userEmail;
	public NetUser (){}

	public NetUser(int userId, String userPass, String userEmail) {
		this.userId = userId;
		this.userPass = userPass;
		this.userEmail = userEmail;
	}

	public NetUser(int userId, String userPass) {
		this.userId = userId;
		this.userPass = userPass;
		this.userEmail=userId+"@gameschool.com";
	}
}
