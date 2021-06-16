package itwn.com.homework.littletrik.teachersystem;

public class Teacher {
	private int teaId;//自增
	private String teaName;//教师名字
	private String teaPass;//教师密码
	private String teaPhoneNum;//教师手机号码
	private static int count;

	public Teacher(){}
	public Teacher(String teaName,String teaPass,String teaPhoneNum){
		this.teaId=++count;
		this.teaName=teaName;
		this.teaPass=teaPass;
		this.teaPhoneNum=teaPhoneNum;
	}

	public String getTeaName() {
		return teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public String getTeaPass() {
		return teaPass;
	}

	public void setTeaPass(String teaPass) {
		this.teaPass = teaPass;
	}

	public String getTeaPhoneNum() {
		return teaPhoneNum;
	}

	public void setTeaPhoneNum(String teaPhoneNum) {
		this.teaPhoneNum = teaPhoneNum;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"teaId=" + teaId +
				", teaName='" + teaName + '\'' +
				", teaPass='" + teaPass + '\'' +
				", teaPhoneNum='" + teaPhoneNum + '\'' +
				'}';
	}
}
