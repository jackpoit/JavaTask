package itwn.com.homework.task0612;

import java.util.*;

public class Task06 {
    public static void main(String[] args) {
    String[] strs={"charles","tina","jack","frank","charles","tina","charles"};
        List<String> list=new LinkedList<>(Arrays.asList(strs));
        System.out.println(list);
        Set<String> set=new LinkedHashSet<>(list);
        //linkedHashSet 会按照添加顺序添加 [charles, tina, jack, frank]
        //new HashSet 是按照hashcode排序的[frank, charles, tina, jack]
        System.out.println(set);
    }
}
