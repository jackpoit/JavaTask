package itwn.com.homework.task0621;

import java.util.LinkedList;

public class Task03 {
	public static void main(String[] args) {
		Basket b=new Basket();
		new Thread(()->{
			synchronized (b) {
				for (int i = 1; i <= 20; i++) {
					Apple apple = new Apple(i);
					b.addApple(apple);
				}
			}
		}).start();
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread(()->{
			synchronized (b) {
				for (int i = 1; i <= 20; i++) {
					b.removeApple();
				}
			}
		}).start();


	}
}
class Basket{
	private LinkedList<Apple> list=new LinkedList<>();

	public void addApple(Apple apple){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.addFirst(apple);
		System.out.println("生产第"+apple.getId()+"个苹果");
		if (list.size()==5){
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void removeApple(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Apple apple=list.removeFirst();
		System.out.println("消费第"+apple.getId()+"个苹果");

		if (list.size()==0) {
			this.notify();
			if (apple.getId() != 16) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}



}
class Apple{
	private int id;

	public Apple(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}
}



