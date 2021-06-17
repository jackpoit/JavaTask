package itwn.com.test.test01.door;

public interface Door {
	default void openDoor(){
		System.out.println("超接口的方法");
	};
	public void closeDoor();
}
