package itwn.com.homework.task0601.printsystem;

public class UserTest {
	public static void main(String[] args) {
		User user=new User();
		ColorPrint colorPrint=new ColorPrint();
		Person person=new Person("张三");
		System.out.println(user.startPrint(colorPrint,person));
	}
}
