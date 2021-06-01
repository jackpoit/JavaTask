package itwn.com.test01.door;

public interface PreThief extends Door {
	 void preThief();
	default void openDoor(){
		System.out.println("贼");
	}
	default void closeDoor(){
		System.out.println("贼2");
	}
}
