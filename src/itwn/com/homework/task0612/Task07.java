package itwn.com.homework.task0612;

import java.util.*;

public class Task07 {
//    如何判断两个集合是否有交集，并打印出他们的交集 集合1:
//    {“charles“, “tina“,” “jack“,” “frank“,” “charles“,“tina“, “charles“,}
//    集合2:
//    {“iis“, “tina“,” “tomcat“,” “frank“,” “charles“,“jboss“, “charles“,}
    public static void main(String[] args) {
        String[] strs1={"charles","tina","jack","frank","charles","tina","charles"};
        String[] strs2={"iis","tina","tomcat","frank","charles","jboss","charles"};
        Set<String> set1=new LinkedHashSet<>(Arrays.asList(strs1));
        Set<String> set2=new LinkedHashSet<>(Arrays.asList(strs2));
        List<String> list=new ArrayList<>();
        for (String s:set1){
            if (set2.contains(s)){
                list.add(s);
            }
        }
        if (list.size()==0){
            System.out.println("无交集");
        }else {
            System.out.println(list);
        }

    }
}
