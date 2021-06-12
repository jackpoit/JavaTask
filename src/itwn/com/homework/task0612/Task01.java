package itwn.com.homework.task0612;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task01 {
    public static void main(String[] args) {
//        现在有一组学生的成绩分别为：98，95，93，67，56，分别对应着学号1001，1002，1003，1004，1005. 选择合适的集合来存放这些 元素，并使用两种方式遍历打印出结果。
        TreeMap<Integer,Integer> map=new TreeMap<>();
        map.put(1001,98);
        map.put(1002,95);
        map.put(1003,93);
        map.put(1004,67);
        map.put(1005,56);
        //1
        Set<Integer> keySet=map.keySet();
        for (Integer i:keySet){
            System.out.println(i+","+ map.get(i));
        }
        //
        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
        System.out.println(entrySet);
    }
}
