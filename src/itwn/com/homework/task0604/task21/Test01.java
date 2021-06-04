package itwn.com.homework.task0604.task21;

public class Test01 {
	public static void main(String[] args) {
		Employee employee01=new Employee("jack",18,"男","manage");
		Employee employee02=new Employee("rose",18,"女","manage");
		System.out.println(employee01);
		System.out.println(employee02);
		System.out.println(employee01.equals(employee02));
	}
}
