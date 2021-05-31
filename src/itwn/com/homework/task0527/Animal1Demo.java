package itwn.com.homework.task0527;

public class Animal1Demo {
    public static void main(String[] args) {
        Animal1 animal01= new Dog();
        System.out.println(animal01.type);
        System.out.println(animal01.sound());

        animal01=new Cat();
        //把Cat类的对象赋值给Animal1类型的变量没问题
        System.out.println(animal01.sound());

        Animal1 animal02=new LittleDog();
        Dog dog=(Dog)animal02;
        System.out.println(dog.sound());

        //类型转换就是不同引用类型的可以转换，
        //子对象转父类型（不如说成把子对象地址赋予给父变量）自动转，因为子类对象方法多，父类需要调用的子类都有，
        // 如： Animal1 animal01=new Dog();
        // 只是子类独有的方法就没了 除了重写的父类方法，其实就是就近原则，
        // *****注意 子对象转父类型 父类的属性就算子类隐藏了  调用的也是父类的属性
        // 父类调用的都是自己的方法，继承给了子类 ，子类重写了，调用是就近调用了子类重写的父类方法



        //但是父转子要声明还要判断，

        //父对象转子类型肯定不行，因为子类如果要调用独有的方法，父类没有就会出现类型转换异常
        //如：Dog dog=(Dog)new Animal1();
        //不能强转，Dog类独有的方法没法引用！


        //父类型的变量转子类型要判断，如果父类型的变量指向的对象属于子类型，那么可以
        //如: Animal1 animal01=new Dog(); （子对象地址赋予给了父类型变量）
        //   Dog dog=(Dog)animal01;可以转 因为animal01实际存的是Dog类的对象
        //  Cat cat =(Cat)amimal01; 不行 因为animal01实际存的是Dog类的对象，不能把Dog类对象的地址给Cat类型的变量，Cat的独有方法 Dog没有



        //强转必须保证对象属于你要转型的类型 用 (object)instanceof(class)判断！！即可
        //其实转换的时候就想一下内存就可以了，看如果吧一个对象赋值给一个类型变量，这个类型变量的所有方法到底能不能调用就完事了
        //只不过父转子要声明 子转父不用声明罢了

    }
}
