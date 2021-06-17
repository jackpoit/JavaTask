package itwn.com.test.test01.door;

public interface PreFire extends Door {
	public void preFire();
	default void openDoor(){}
	 void closeDoor();
}
