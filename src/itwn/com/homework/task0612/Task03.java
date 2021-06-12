package itwn.com.homework.task0612;

import itwn.com.homework.task0604.task21.Employee;

import java.util.ArrayList;
import java.util.Comparator;

public class Task03 {
    public static void main(String[] args) {
//        已知员工类Employee，输出结果需要先按照部门编号升序排列，同一个部门下的薪资降序排序列（使用ArrayList实现）
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(3,1200));
        list.add(new Employee(2,700));
        list.add(new Employee(4,1200));
        list.add(new Employee(5,300));
        list.add(new Employee(1,500));
        list.add(new Employee(4,200));
        list.add(new Employee(5,600));
        list.add(new Employee(1,800));
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getNum()==o2.getNum()?Integer.compare(o2.getSalary(),o1.getSalary()):Integer.compare(o1.getNum(),o2.getNum());
            }
        });


        System.out.println(list);
    }
    static class  Employee{
        private int num;
        private int salary;

        public Employee() {}

        public Employee(int num, int salary) {
            this.num = num;
            this.salary = salary;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "num=" + num +
                    ", salary=" + salary +
                    '}'+"\n";
        }
    }

}
