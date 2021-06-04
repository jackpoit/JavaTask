package itwn.com.homework.task0604.task23;

public class AntuThief implements Door,FireAlarm{
	@Override
	public void open() {
		System.out.println("开防盗门");
	}

	@Override
	public void close() {
		System.out.println("关防盗门");
	}
}
