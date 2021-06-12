package itwn.com.homework.task0612;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task09 {
    public static void main(String[] args) {
//        在Arraylist中存放以下数据： “张三”、“李四”、“王五”、“张 三”、“aaa”、“aaa”、“bbb” 要求：去除ArrayList中的重复元素。
        String[] strs={"张三","李四","王五","张三","aaa","aaa","bbb"};
        List<String> list=Arrays.asList(strs);
        List<String> ans=new ArrayList<>();
        for (String s:list){
         if (!ans.contains(s)){
             ans.add(s);
         }
        }
        System.out.println(list);
        System.out.println(ans);




    }
}
