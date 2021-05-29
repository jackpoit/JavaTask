package itwn.com.homework.task0527;

public class Student {
    private String name;
    private int age;
    private String degree;
    public Student(){}
    public Student(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    public void show(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", degree='" + degree + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


}
