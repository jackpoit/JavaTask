package itwn.com.homework.task0601.teastusystem;

public class Student implements Person {
	private String name;
	private int score;
	public Student(){}
	public Student(String name,int score){
		this.name=name;
		this.score=score;
	}
	@Override
	public String toString() {
		return "学生" + name + "\t" + "成绩" + score +"\n";
	}

	@Override
	public Boolean depend(Person person) {
		Student student=(Student) person;
		return student.score >=90;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
