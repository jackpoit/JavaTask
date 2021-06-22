package itwn.com.test.test07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test09 {
	public static void main(String[] args) {
//		ExecutorService es01= Executors.newCachedThreadPool();
//		for (int i=0;i<10;i++){
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			es01.execute(()->{
//				while (true) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("执行" + Thread.currentThread().getName());
//				}
//			});
//		}

//		ExecutorService es02=Executors.newFixedThreadPool(5);
//		for (int i=0;i<10;i++){
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			es02.execute(()->{
//				while (true) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("执行" + Thread.currentThread().getName());
//				}
//			});
//		}

//		ExecutorService es03=Executors.newSingleThreadExecutor();
//		for (int i=0;i<10;i++){
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			es03.execute(()->{
//				while (true) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println("执行" + Thread.currentThread().getName());
//				}
//			});
//		}

		//***************************************************
		ScheduledExecutorService es04=Executors.newScheduledThreadPool(5);
		es04.scheduleWithFixedDelay(()->{
			System.out.println(Thread.currentThread().getName()+"run");
		},3,5, TimeUnit.SECONDS);
		//**************************


	}

}
