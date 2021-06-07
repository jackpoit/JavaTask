package itwn.com.exam0607.exam04;

public class AntuThief implements Door,FireAlarm{

	@Override
	public void open() {
		System.out.println("开防盗门");
	}

	@Override
	public void close() {
		System.out.println("关防盗门");
	}

	@Override
	public void preFire() {
		System.out.println("防盗门的防火功能");
	}
}
