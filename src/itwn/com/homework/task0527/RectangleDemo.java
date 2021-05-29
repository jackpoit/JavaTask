package itwn.com.homework.task0527;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle01=new Rectangle();
        rectangle01.setLength(2.5);
        rectangle01.setWidth(2.4);
        System.out.println(rectangle01.getLength());
        System.out.println(rectangle01.getWidth());
        System.out.println("面积为"+rectangle01.area());
    }
}
