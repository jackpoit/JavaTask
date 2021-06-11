package itwn.com.aslisttest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AsListTest {
	public static void main(String[] args) {
		int[] nums={1,2,4,5,6,7,8,9,10};
		Integer[] nums1={1,2,4,5,6,7,8,9,10};

		List list1= Arrays.asList(nums1);
		//这种方式 asList产生的 ArrayList是Arrays里的一个内部类，和ArrayList集合不是一个东西，没有add()、remove()方法
		//list1.add("ssss");  调用add等方法会报错

		System.out.println(list1);
		List list= new LinkedList<>(Arrays.asList(nums));
		list.add("ssss"); //这样就不会报错 通过new一个新的集合然后把 asList作为参数传入 list就可调用add方法了

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
