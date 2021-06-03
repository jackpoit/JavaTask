package itwn.com.homework.task0603;

public class Task01 {
	public static void main(String[] args) {
		System.out.println(dependReverse("aabba"));
	}

	public static boolean dependReverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		String str1=new String(sb.reverse());
		return str.equals(str1);


	}

}
