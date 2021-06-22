package itwn.com.homework.task0621;

public class Task01 {
	public static void main(String[] args) {
		Object obj=new Object();
		new Thread(()->{
			synchronized (obj){
				for (int i=1;i<=78;i++){
					System.out.println(i);
					if (i%3==0){
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
			synchronized (obj){
				for (char i='a';i<='z';i++){
					System.out.println(i);
					obj.notify();
						if (i!='z'){
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
