package itwn.com.homework.task0527;

public class Patient {
    private String name;
    private char sex;
    private int age;
    private float weight;
    private boolean allergies;

    public Patient(){}

    public Patient(String name, char sex, int age, float weight, boolean allergies) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.allergies = allergies;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", weight=" + weight +
                ", allergies=" + allergies +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isAllergies() {
        return allergies;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }
}
