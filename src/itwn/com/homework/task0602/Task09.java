package itwn.com.homework.task0602;

public class Task09 {
	public static void main(String[] args) {
		String str="To be or not to be";
		String[] strs=str.split(" ");
		String output="";
		for (String s : strs) {
			for (int j = 0; j < s.length(); j++) {
				output += s.charAt(s.length() - 1 - j);
			}
			output += " ";
		}
		System.out.println(output);
	}
}
