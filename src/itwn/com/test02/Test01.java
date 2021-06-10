package itwn.com.test02;

public class Test01 {
    public static void main(String args[]){
        Integer x = 5;
        // 返回 byte 原生数据类型
        System.out.println( x.valueOf("10.0") );

        // 返回 double 原生数据类型
        System.out.println(x.doubleValue());

        // 返回 long 原生数据类型
        System.out.println( x.longValue() );
    }
}
