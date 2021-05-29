package itwn.com.homework.task0527;


class ProfessorTest {
    public static void main(String[] args) {
        Professor professor01=new Professor("jack",'男',40,"数学");
        professor01.set_result(1);
        System.out.println(professor01.gerDetails());
    }

}