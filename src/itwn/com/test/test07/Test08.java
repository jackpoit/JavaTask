package itwn.com.test.test07;

import java.util.LinkedList;

public class Test08 {
	public static void main(String[] args) {
		Object obj=new Object();
		new Thread(()->{
			synchronized (obj) {
				for (int i = 1; i <= 52; i++) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
					if (i%2==0){
						obj.notify();
						try {
							obj.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}).start();

		new Thread(()->{
			synchronized (obj) {
				for (char c = 'A'; c <= 'Z'; c++) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(c);
					obj.notify();
					if (c!='Z'){
						try {
							obj.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}).start();

	}

}
