package itwn.com.homework.atm;


class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        list.add(1);//往容器中添加元素
        list.add("jack");
        list.add(3);
        System.out.println(list);//重写了toString 的方法
        //1.遍历数据   list.size() 获取容器中元素的个数
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));//根据下标获取元素信息
        }
        list.remove(0);//根据下标获取元素
        System.out.println(list);
        list.set(0,100);//根据下标修改元素信息
        System.out.println(list);
    }

}