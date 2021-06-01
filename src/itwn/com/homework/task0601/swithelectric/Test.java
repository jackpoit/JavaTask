package itwn.com.homework.task0601.swithelectric;

public class Test {
	public static void main(String[] args) {
		User user=new User();
		Electricity[] eList=new Electricity[]{new Tv(),new Fan(),new Bulb()};
		for (Electricity e:eList){
			e.open();
		}
		for (Electricity e:eList){
			e.close();
		}
	}
}
