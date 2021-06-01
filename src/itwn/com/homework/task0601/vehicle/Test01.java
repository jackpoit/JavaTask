package itwn.com.homework.task0601.vehicle;

public class Test01 {
	public static void main(String[] args) {
		Master master=new Master();
		Vehicle[] vehicles=new Vehicle[]{new Bike(),new Car(),new Train()};
		for (Vehicle vehicle:vehicles){
			vehicle.drive();
		}

	}
}
