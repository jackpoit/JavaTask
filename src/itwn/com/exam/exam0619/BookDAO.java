package itwn.com.exam.exam0619;

import itwn.com.chessdemo03.User;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDAO {
	private Map<String,Book> map;
	private String path="file/book.txt" ;
	{
		if (new File(path).exists()){
				map=readMap();
		}else {
			map=new LinkedHashMap<>();
			Book book1=new Book("001","JACK",100);
			Book book2=new Book("安娜卡列","JACK",100);
			Book book3=new Book("哈哈或","JACK",100);
			map.put(book1.getName(),book1);
			map.put(book2.getName(),book2);
			map.put(book3.getName(),book3);
			writeMap();
		}
	}

	public void writeMap(){
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(path));
			out.writeObject(map);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public Map<String, Book> readMap() {
		Map<String,Book> res;
		try {
			ObjectInputStream in= new ObjectInputStream(new FileInputStream(path));
			res= (Map<String, Book>) in.readObject();
			in.close();
			return res;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void queryBook(){
		for (Map.Entry<String,Book> e: map.entrySet()) {
			System.out.println(e.getValue());
		}
	}
	public boolean add(Book book){
		if (map.containsKey(book.getName())){
			return false;
		}else {
			map.put(book.getName(),book);
			writeMap();
			return true;
		}
	}
	public  boolean del(String name){
		if (map.containsKey(name)){
			map.remove(name);
			writeMap();
			return true;
		}else {
			return false;
		}
	}
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
