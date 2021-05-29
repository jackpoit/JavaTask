package itwn.com.homework.task0527;

public class Graduate extends Undergraduate{
    private String direction;
    public Graduate(){}

    public Graduate(String name, int age, String degree, String specialty, String direction) {
        super(name, age, degree, specialty);
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Graduate{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", degree='" + getDegree() + '\'' +
                ",specialty='" + getSpecialty() + '\'' +
                ",direction='" + direction + '\'' +
                '}';
    }
}
