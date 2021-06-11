package itwn.com.test06.stuexception;

import java.util.Scanner;

public class StuTest {


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Student student=new Student();
		while (true){
			try {
				student.setStuNo(scanner.next());
				break;
			}
			catch (StuNoException e){
				System.out.println(e.getMessage());
			}
		}
	}

	static class Student{
		private String stuNo;
		private String stuPass;
		private int stuScore;
		public Student(){}
		public Student(String stuNo, String stuPass, int stuScore) {
			this.stuNo = stuNo;
			this.stuPass = stuPass;
			this.stuScore = stuScore;
		}

		public String getStuNo() {
			return stuNo;
		}

		public void setStuNo(String stuNo) throws StuNoException{
			if (stuNo.matches("^[0-9a-zA-Z]{3,6}$")){
				this.stuNo=stuNo;
			}else {
				throw new StuNoException("3-6位字母或数字");
			}

		}

		public String getStuPass() {
			return stuPass;
		}

		public void setStuPass(String stuPass) throws StuPassException{
			if (stuPass.matches("^[0-9]{6}$")) {
				this.stuPass = stuPass;
			}else {
				throw new StuPassException("6位数字");
			}
		}

		public int getStuScore() {
			return stuScore;
		}

		public void setStuScore(int stuScore) throws StuScoreException{
			if (stuScore<=100&&stuScore>0) {
				this.stuScore = stuScore;
			}else {
				throw new StuScoreException("0-100");
			}
		}
	}

}

