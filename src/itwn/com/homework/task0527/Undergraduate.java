package itwn.com.homework.task0527;

public class Undergraduate extends Student{
    private String specialty;

    public Undergraduate(){}
    public Undergraduate(String name, int age, String degree, String specialty) {
        super(name, age, degree);
        this.specialty = specialty;
    }

    public void setSpecialty(String specialty){
        this.specialty=specialty;
    }
    public String getSpecialty(){
        return specialty;
    }


    @Override
    public String toString() {
        return "Undergraduate{" +
                "name='" + getName() + '\'' +
                ", age=" + this.getAge() +
                ", degree='" + super.getDegree() + '\'' +
                ",specialty='" + specialty + '\'' +
                '}';
    }
}
