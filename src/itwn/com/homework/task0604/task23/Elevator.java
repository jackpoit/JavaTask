package itwn.com.homework.task0604.task23;

public class Elevator implements Door,SmokeAlarm{

	@Override
	public void open() {
		System.out.println("开电梯门");
	}

	@Override
	public void close() {
		System.out.println("关电梯门");
	}
}
