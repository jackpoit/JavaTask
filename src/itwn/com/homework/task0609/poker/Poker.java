package itwn.com.homework.task0609.poker;

public class Poker {
	private int id;
	private String color;
	private String value;
	public static int count;
	public Poker() {

	}
	public Poker(String color, String value) {
		this.id=++count;
		this.color = color;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return color+value;
	}


}
