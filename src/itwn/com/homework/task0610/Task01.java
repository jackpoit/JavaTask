package itwn.com.homework.task0610;
import java.util.*;
public class Task01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入：");
		String str=scanner.next();
		HashSet<Character> set=new HashSet<>();
		for (char c:str.toCharArray()){
			set.add(c);
		}
		for (char c:set){
			int count=0;
			for (char d:str.toCharArray()){
				if (d==c){
					count++;
				}
			}
			System.out.println(c+"出现的次数："+count);
		}
	}
}
