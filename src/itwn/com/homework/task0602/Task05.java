package itwn.com.homework.task0602;

public class Task05 {
	public static void main(String[] args) {
		String str="weqtEWTwqteqweQWR";
		String upStr="";
		String loStr="";
		for (int i=0;i<str.length();i++){
			if (str.charAt(i)>='a'){
				loStr+=str.charAt(i);
			}else {
				upStr+=str.charAt(i);
			}
		}
		System.out.println(upStr);
		System.out.println(loStr);
	}
}
