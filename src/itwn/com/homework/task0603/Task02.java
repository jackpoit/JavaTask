package itwn.com.homework.task0603;

public class Task02 {
	public static void main(String[] args) {
		String str="To be or not to be";
		String[] strs=str.split(" ");
		String res="";
		for (int i=0;i<strs.length;i++){
			StringBuffer sb=new StringBuffer(strs[i]);
			res+=new String(sb.reverse())+" ";
		}
		System.out.println(res);
	}
}
