package itwn.com.exam.exam0619.task07;

import java.io.*;

public class Book implements Serializable{

	private int id;
	private String name;
	private String author;
	private double price;
	private static int count;
	private final static String PATH ="file/count.txt";
		{
		if (new File(PATH).exists()){
			count=read();
		}else {
			count=1;
			write();
		}
	}
	//把count写入文件
	public void write(){
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(PATH));
			out.writeObject(count);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//从文件中读count
	public Integer read() {
		Integer res;
		try {
			ObjectInputStream in= new ObjectInputStream(new FileInputStream(PATH));
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
