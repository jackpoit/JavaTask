package itwn.com.exam0607.exam04;

public class Push implements Door{

	@Override
	public void open(){
		System.out.println("开推拉门");
	}
	@Override
	public void close(){
		System.out.println("关推拉门");
	}
}
