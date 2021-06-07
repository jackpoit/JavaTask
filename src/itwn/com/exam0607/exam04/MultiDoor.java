package itwn.com.exam0607.exam04;

public interface MultiDoor extends Door,SmokeAlarm,FireAlarm {

	@Override
	default void preFire(){
		System.out.println("多功能门的防火");
	}
	@Override
	default void preSmoke(){
		System.out.println("多功能门的防烟");
	}
}
