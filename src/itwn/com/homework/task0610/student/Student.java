package itwn.com.homework.task0610.student;

public class Student {
	private int score;
	private String name;
	private double fee;

	public Student() {
	}

	public Student(int score, String name, double fee) {
		this.score = score;
		this.name = name;
		this.fee = fee;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student{" +
				"score=" + score +
				", name='" + name + '\'' +
				", fee=" + fee +
				'}'+"\n";
	}
}
