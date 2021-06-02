package itwn.com.homework.task0602;

public class Task06 {
	public static void main(String[] args) {
		String str="I am biter";
		String[] strs=str.split(" ");
		String str2="";
		for (int i=strs.length-1;i>=0;i--){
			str2+=strs[i]+" ";
		}
		System.out.println(str2);
	}
}
