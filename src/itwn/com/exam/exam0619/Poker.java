package itwn.com.exam.exam0619;

public class Poker {
	private String color;
	private String value;
	private int id;
	public static int count=0;

	public Poker( ){
	}

	public Poker(String color, String value) {
		this.id=++count;
		this.color = color;
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
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
