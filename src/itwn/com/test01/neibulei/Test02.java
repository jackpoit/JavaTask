package itwn.com.test01.neibulei;

import itwn.com.test01.neibulei.MyKeyListener;

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
