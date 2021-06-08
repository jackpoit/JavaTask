package itwn.com.homework.task0608.employee;

public class Employee {
	private int id;
	private static int count;
	private String name;
	private String salary;
	private String phone;

	public Employee() {
	}

	public Employee(String name, String salary, String phone) {
		this.id=++count;
		this.name = name;
		this.salary = salary;
		this.phone = phone;
	}

	public int getId(){
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", salary='" + salary + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}
}
