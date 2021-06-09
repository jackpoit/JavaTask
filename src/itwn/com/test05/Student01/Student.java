package itwn.com.test05.Student01;

public class Student {
	private int id;
	private String stuName;
	private int score;

	public Student() {
	}

	public Student(int id, String stuName, int score) {
		this.id = id;
		this.stuName = stuName;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}



	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", stuName='" + stuName + '\'' +
				", stuAddress='" + score + '\'' +
				'}'+"\n";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;

		Student student = (Student) o;

		if (id != student.id) return false;
		if (score != student.score) return false;
		return stuName != null ? stuName.equals(student.stuName) : student.stuName == null;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (stuName != null ? stuName.hashCode() : 0);
		result = 31 * result + score;
		return result;
	}


}
