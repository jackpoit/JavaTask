package itwn.com.test01.door;

public interface Door {
	default void openDoor(){
		System.out.println("超接口的方法");
	};
	public void closeDoor();
}
