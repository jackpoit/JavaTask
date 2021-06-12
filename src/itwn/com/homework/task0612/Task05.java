package itwn.com.homework.task0612;

import itwn.com.aslisttest.mynum.MyNum;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task05 {
//    编写一个应用程序，设有字符串"yekmaakkccekymbvb",求出该字 符串中有多少种字符,以及每个字符的个数?
    public static void main(String[] args) {
        String strs = "yekmaakkccekymbvb";
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char c : strs.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }

    }
}
