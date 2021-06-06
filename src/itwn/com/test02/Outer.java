package itwn.com.test02;


public class Outer {
    int age=18;
    public void method() {
        class Inner{
            int age=18;
            public void test() {
                System.out.println(age);
            }
        }
        new Inner().test();
    }
}