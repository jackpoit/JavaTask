package itwn.com.exam.exam0619;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Book implements Serializable{

	private int id;
	private String name;
	private String author;
	private double price;
	private static int count;
	private static String path="file/count.txt";
		{
		if (new File(path).exists()){
			count=read();
		}else {
			count=1;
			write();
		}
	}

	public void write(){
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(path));
			out.writeObject(count);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public Integer read() {
		Integer res;
		try {
			ObjectInputStream in= new ObjectInputStream(new FileInputStream(path));
			res= (Integer) in.readObject();
			in.close();
			return res;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Book( String name, String author, double price) {
		this.id = count++;
		write();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", author='" + author + '\'' +
				", price=" + price +
				'}';
	}
}
