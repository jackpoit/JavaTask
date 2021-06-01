package itwn.com.homework.task0601.swithelectric;

public class User {
	public void On(Electricity electricity){
		electricity.open();
	}
	public void in(Electricity electricity){
		electricity.close();
	}
}
