package itwn.com.test.test01.neibulei;

public class Test02 {
	public static void main(String[] args) {
		MyKeyListener kl01=new MyKeyListener(){
			@Override
			public void pressKey(){
				System.out.println("压键盘");
			}
		};

		new MyKeyListener(){
			@Override
			public void keyDown(){
				System.out.println("键盘按下");
			}
		};
	}
}
