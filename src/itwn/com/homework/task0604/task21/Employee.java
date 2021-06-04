package itwn.com.homework.task0604.task21;

import java.util.Objects;

public class Employee extends Person{
	private String stuff;

	public Employee() {
	}

	public Employee(String name, int age, String sex,String stuff) {
		super(name, age, sex);
		this.stuff = stuff;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Employee)) return false;
		if (!super.equals(o)) return false;
		Employee employee = (Employee) o;
		return Objects.equals(stuff, employee.stuff);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), stuff);
	}

	public String getStuff() {
		return stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + getName() + '\'' +
				", age=" + getAge() +
				", sex='" + getSex() + '\'' +
				",stuff='" + stuff + '\'' +
				'}';
	}
}
