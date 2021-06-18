package itwn.com.chessdemo03;

import java.io.Serializable;

public class User implements Serializable {
	private String userNo;
	private String userPass;
	private String userPhone;

	public User(String userNo, String userPass, String userPhone) {
		this.userNo = userNo;
		this.userPass = userPass;
		this.userPhone = userPhone;
	}

	public User() {
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
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

}
