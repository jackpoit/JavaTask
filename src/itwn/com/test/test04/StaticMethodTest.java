package itwn.com.test.test04;

public class StaticMethodTest {
	public static void main(String[] args) {
		Animal.sound();
		Pet.sound();
		Cat.sound();

		Animal cat=new Cat();
		Animal.sound();
	}

}
