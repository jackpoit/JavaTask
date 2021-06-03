package itwn.com.test01;

import java.math.BigDecimal;
import java.util.Arrays;

public abstract class Test01 {
	public static void main(String[] args) {
		int[] arr= {10,80,30,20,100};
		int[] arr2=Arrays.copyOf(arr,10);
		arr2[1]=1000;
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr));



	}
}
