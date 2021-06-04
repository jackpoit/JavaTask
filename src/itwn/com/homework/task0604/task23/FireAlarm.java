package itwn.com.homework.task0604.task23;

public interface FireAlarm {
	default void preFire(){
		System.out.println("防火");
	};
}
