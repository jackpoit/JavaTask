package itwn.com.homework.task0604.task23;

public interface MultiDoor extends Door,SmokeAlarm,FireAlarm {

	@Override
	default void preFire(){
		System.out.println("多功能防火");
	}
	@Override
	default void preSmoke(){
		System.out.println("多功能防火");
	}
}
