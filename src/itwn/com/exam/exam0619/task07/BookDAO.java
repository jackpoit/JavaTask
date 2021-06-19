package itwn.com.exam.exam0619.task07;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDAO {
	private Map<String,Book> map;
	private final String PATH ="file/book.txt" ;

	//文件写入
	{
		if (new File(PATH).exists()){
				map=readMap();
		}else {
			map=new LinkedHashMap<>();
			Book book1=new Book("violetevergarden","jack",100);
			Book book2=new Book("RE0","marry",100);
			Book book3=new Book("素晴","tina",100);
			map.put(book1.getName(),book1);
			map.put(book2.getName(),book2);
			map.put(book3.getName(),book3);
			writeMap();
		}
	}
	//把map写入文件
	public void writeMap(){
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(PATH));
			out.writeObject(map);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//读map
	public Map<String, Book> readMap() {
		Map<String,Book> res;
		try {
			ObjectInputStream in= new ObjectInputStream(new FileInputStream(PATH));
			res= (Map<String, Book>) in.readObject();
			in.close();
			return res;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	//打印所有信息
	public void queryBook(){
		for (Map.Entry<String,Book> e: map.entrySet()) {
			System.out.println(e.getValue());
		}
	}
	//添加书籍
	public boolean add(Book book){
		if (map.containsKey(book.getName())){
			return false;
		}else {
			map.put(book.getName(),book);
			writeMap();
			return true;
		}
	}
	//删除书籍
	public  boolean del(String name){
		if (map.containsKey(name)){
			map.remove(name);
			writeMap();
			return true;
		}else {
			return false;
		}
	}

	//模糊查询
	public String check(String str){
		String res="";
		for (char c:str.toCharArray()){
			for (String s: map.keySet()){
				if (s.contains(c+"")){
					res+=map.get(s).toString()+"\n";
				}
			}
		}
		return res;
	}

}
