package itwn.com.homework.task0527;

class StudentTest {
    public static void main(String[] args) {
        Undergraduate undergraduate01=new Undergraduate("JACK",20,"本科","物理");
        undergraduate01.show();
        Graduate graduate=new Graduate("ROSE",18,"研究生","物理","高能物理");
        graduate.show();
    }

}