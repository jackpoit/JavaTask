package itwn.com.test06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		int[] nums={1,2,4,5,6,7,8,9,10};
		Integer[] nums1={1,2,4,5,6,7,8,9,10};
		List list= new LinkedList<>(Arrays.asList(nums));

		//没写 默认为object  asList底层 是
//		public static <T> List<T> asList(T... a) {
//			return new Arrays.ArrayList<>(a);
//		}
// 		如果传入 int[] 型的nums 会把nums当成一个引用类型的obj 吧nums变量（存的int数组的地址)当成一个元素存入了

		list.add(Arrays.asList(nums1));
		System.out.println(list);


		list.addAll(Arrays.asList(nums1));
		System.out.println(list);

//		List<Integer> list=new LinkedList<>(Arrays.asList(nums));


		Object[] arr=new Object[]{nums,nums1};
		System.out.println(arr[0]);
		System.out.println(arr[1]);


	}
}
