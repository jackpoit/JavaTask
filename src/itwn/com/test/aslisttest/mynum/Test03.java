package itwn.com.test.aslisttest.mynum;


import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		map.put("jack", 100);
		map.put("rouse",98);
		map.put("charles", 100);
		map.put("jack", 99);//将替换前面的key
		map.put("tina",200);
		map.put("jam",95);

		System.out.println(map);
		System.out.println(map.containsValue(100));
		System.out.println(map.containsKey("tina"));

		System.out.println(map.size());
		Set<String> set01=map.keySet();

		System.out.println(set01);


		Set<Entry<String, Integer>> setEntry=map.entrySet();
		System.out.println(map);


		for(Entry<String, Integer> entry:setEntry) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}


		for(String key:set01) {
			Integer value=map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
