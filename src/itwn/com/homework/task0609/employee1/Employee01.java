package itwn.com.homework.task0609.employee1;

public class Employee01 {
	private int num;
	private String name;
	private double salary;

	public Employee01() {
	}

	public Employee01(int num, String name, double salary) {
		this.num = num;
		this.name = name;
		this.salary = salary;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee01{" +
				"num=" + num +
				", name='" + name + '\'' +
				", salary=" + salary +
				'}'+"\n";
	}
}
