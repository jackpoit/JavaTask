package itwn.com.homework.task0527;

public class Animal {
    private String type;
    private int id;
    private String name;
    private String color;

    public Animal(){}
    public Animal(int id, String name, String color,String type) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.type=type;
    }
    public Animal(String name,String color,String type){
        this.id=1;
        this.name=name;
        this.color=color;
        this.type=type;
    }
    public Animal(int id,String type){
        this.id=id;
        this.name="旺财";
        this.color="红色";
        this.type=type;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
