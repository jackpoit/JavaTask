package itwn.com.homework.task0610;

import com.sun.deploy.util.StringUtils;

import java.util.HashSet;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] strs=new String[]{"","","","",""};
        for (int i=0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"道题答案");
            HashSet<Character> set=new HashSet<>();
            for (char c:scanner.next().toLowerCase().toCharArray()){
                set.add(c);
            }
            for (char c:set){
            strs[i]+=c;
            }
        }
        String[] ans={"abc","bcd","ab","cd","abcd"};
        int count=100;
        for (int i=0;i<5;i++){
          if (ans[i].equals(strs[i])){
              continue;
          }
          if (ans[i].contains(strs[i])){
              count-=10;
              continue;
          }
          count-=20;
        }
        System.out.println(count);

    }
}
