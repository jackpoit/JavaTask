package itwn.com.homework.task0604.task23;

public interface SmokeAlarm {
	default void preSmoke(){
		System.out.println("防烟");
	};
}
