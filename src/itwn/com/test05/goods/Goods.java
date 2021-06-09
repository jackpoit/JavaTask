package itwn.com.test05.goods;

public class Goods {
	private int id ;
	private String name;
	private int num;
	private double price;

	public Goods() {
	}

	public Goods(int id, String name, int num, double price) {
		this.id = id;
		this.name = name;
		this.num = num;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods{" +
				"id=" + id +
				", name='" + name + '\'' +
				", num=" + num +
				", price=" + price +
				'}'+"\n";
	}
}