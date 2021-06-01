package itwn.com.homework.task0601.printsystem;

public class User {
	public String startPrint(MyPrint myPrint,Person person){
			return person.show()+myPrint.show();
	}
}
