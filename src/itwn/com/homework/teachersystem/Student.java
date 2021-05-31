package itwn.com.homework.teachersystem;

public class Student {
	private int stuId;
	private String stuName;
	private String stuPass;
	private String stuPhoneNum;
	private int stuScore;
	private static int count;
	public Student(){}

	public Student(String stuName, String stuPhoneNum, int stuScore) {
		this.stuId=++count;
		this.stuPass="123456";
		this.stuName = stuName;
		this.stuPhoneNum = stuPhoneNum;
		this.stuScore = stuScore;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuPass() {
		return stuPass;
	}

	public void setStuPass(String stuPass) {
		this.stuPass = stuPass;
	}

	public String getStuPhoneNum() {
		return stuPhoneNum;
	}

	public void setStuPhoneNum(String stuPhoneNum) {
		this.stuPhoneNum = stuPhoneNum;
	}

	public int getStuScore() {
		return stuScore;
	}

	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}

	public int getStuId() {
		return stuId;
	}

	@Override
	public String toString() {
		return "Student{" +
				"stuId=" + stuId +
				", stuName='" + stuName + '\'' +
				", stuPass='" + stuPass + '\'' +
				", stuPhoneNum='" + stuPhoneNum + '\'' +
				", stuScore=" + stuScore +
				'}'+"\n";
	}
}
