package itwn.com.homework.task0601.animal;

public class Test {
	public static void main(String[] args) {
		Animal b=new Bird();
		b.eat();
		Bird bird=(Bird) b;
		bird.eat();
		bird.fly();

	}
}
