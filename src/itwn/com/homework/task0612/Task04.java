package itwn.com.homework.task0612;

import java.util.Comparator;

import java.util.TreeSet;

public class Task04 {
    public static void main(String[] args) {

        TreeSet<Student> set=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTotalNum()==o2.getTotalNum()?Integer.compare(o2.getMathNum(),o1.getMathNum()):Integer.compare(o2.getTotalNum(),o1.getTotalNum());
            }
        });
        set.add(new Student(122,105));
        set.add(new Student(122,66));
        set.add(new Student(233,99));
        set.add(new Student(324,65));
        set.add(new Student(233,88));

        System.out.println(set);
    }
    static class Student {
        private int totalNum;
        private int mathNum;

        public Student() {}

        public Student(int totalNum, int salary) {
            this.totalNum = totalNum;
            this.mathNum = salary;
        }

        public int getTotalNum() {
            return totalNum;
        }

        public void setTotalNum(int totalNum) {
            this.totalNum = totalNum;
        }

        public int getMathNum() {
            return mathNum;
        }

        public void setMathNum(int mathNum) {
            this.mathNum = mathNum;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "totalNum=" + totalNum +
                    ", mathNum=" + mathNum +
                    '}'+"\n";
        }
    }
}
