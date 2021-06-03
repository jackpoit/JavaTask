package itwn.com.homework.task0603;

import java.util.Random;

public class Task03 {
	public static void main(String[] args) {
		Random ra=new Random();
		int[] arr=new int[100];
		for (int i=0;i<arr.length;i++){
			arr[i]=ra.nextInt(9000)+1000;
		}
		for (int i=0;i<4;i++){
			System.out.println(arr[ra.nextInt(100)]);
		}
	}
}
