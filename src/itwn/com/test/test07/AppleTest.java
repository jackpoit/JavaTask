package itwn.com.test.test07;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AppleTest {
	public static void main(String[] args) {
		Basket basket=new Basket();
		new Thread(()->{
			for (int i=1;i<=20;i++){
				Apple apple=new Apple(i);
				basket.addApple(apple);
			}
		}).start();
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread(()->{
			for (int i=1;i<=20;i++){
				basket.removeApple();
			}
		}).start();
	}
}
class Basket{
	private LinkedList<Apple> list=new LinkedList<>();
//	private Lock lock=new ReentrantLock();
//	private Condition condition=lock.newCondition();
//	public  void addApple(Apple apple){
//		lock.lock();
//		try {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			list.addFirst(apple);
//			condition.signal();
//			System.out.println("添加了第"+apple.getId()+"个苹果");
//			while (list.size()==5){
//				try {
//					condition.await();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		finally{
//			lock.unlock();
//		}
//
//
//	}
//	public synchronized void removeApple(){
//		lock.lock();
//		try {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			Apple apple=list.removeFirst();
//			condition.signal();
//			System.out.println("删除了第"+apple.getId()+"个苹果");
//			if (list.size()==0) {
//				try {
//					condition.await();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		finally {
//			lock.unlock();
//		}
//
//
//	}

 	public synchronized void addApple(Apple apple){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.addFirst(apple);
		System.out.println("添加了第"+apple.getId()+"个苹果");
		if (list.size()==5){
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	public synchronized void removeApple(){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Apple apple=list.removeFirst();
		System.out.println("删除了第"+apple.getId()+"个苹果");
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
	public Apple(int id){
		this.id =id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id+"";
	}
}
