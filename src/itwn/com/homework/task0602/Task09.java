package itwn.com.homework.task0602;

public class Task09 {
	public static void main(String[] args) {
		String str="To be or not to be";
		String[] strs=str.split(" ");
		String output="";
		for (int i=0;i<strs.length;i++){
			for (int j=0;j<strs[i].length();j++){
				output+=strs[i].charAt(strs[i].length()-1-j);
			}
			output+=" ";
		}
		System.out.println(output);
	}
}
