package itwn.com.homework.task0527;

public class Professor extends Human{
    private String course;
    private int result;
    public Professor(){}
    public Professor(String name, char sex, int age, String course) {
        super(name, sex, age);
        this.course = course;
    }

    public String gerDetails(){
        return "姓名:"+getName()+
                "\t性别:"+getSex()+
                "\t年龄"+getAge()+
                "\t讲授课程："+course;
    }
    public boolean set_result(int x){
        if (x>=0&&x<=3){
            this.result=x;
            return true;
        }else {
            System.out.println("教学效果设置值错误");
            return false;
        }
    }
}
