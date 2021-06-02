package itwn.com.homework.task0601.teastusystem;

public class Teacher implements Person{
	private String name;
	private int num;
	public Teacher(){}
	public Teacher(String name,int num){
		this.name=name;
		this.num=num;
	}

	@Override
	public String toString() {
		return "老师" + name + "\t" + "论文数" + num +"\n";
	}
	@Override
	public Boolean depend(Person person) {
		Teacher teacher=(Teacher) person;
		return teacher.num >=3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
