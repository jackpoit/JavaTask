package itwn.com.homework.task0612;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task02 {
    public static void main(String[] args) {
        String str="abcaadef";
        ArrayList<Character> list=new ArrayList<>();
        for (char c:str.toCharArray()){
            list.add(c);
        }
        System.out.println(list);

        Set<Character> set=new HashSet<>(list);
        System.out.println(set);
    }
}
