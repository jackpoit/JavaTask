package itwn.com.homework.task0603;

import java.util.Arrays;

public class Task07 {
	public static void main(String[] args) {
		int[] arr1={10,80,100,90,200,78};
		int[] arr2={300,100,200,180,79,90};
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int[] arr3=Arrays.copyOf(arr1,3);
		int[] arr4=Arrays.copyOfRange(arr2,3,6);
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		//??????????

	}
}
