package itwn.com.homework.littletrik.poker;

public class Poker {
    private int id;
    private String value;//A,2，K
    private String color;//♠  ♥  ♦  ♣
    private static int count;
    public Poker(){}

    public Poker(String value, String color) {
        this.id=++count;
        this.value = value;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color+value;

    }
}
