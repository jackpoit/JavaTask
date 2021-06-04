package itwn.com.homework.task0604.task23;

public class Test {
	public static void main(String[] args) {
		Door[] doors=new Door[]{new Push(),new AntuThief(),new Elevator()};

		for (Door door:doors){
			door.open();
			door.close();
		}
		new AntuThief().preFire();
		new Elevator().preSmoke();

		new MultiDoor(){}.preFire();
		new MultiDoor(){}.preSmoke();
	}
}
