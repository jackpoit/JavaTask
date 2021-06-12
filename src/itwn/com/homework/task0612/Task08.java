package itwn.com.homework.task0612;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task08 {
//    某中学有若干学生(学生对象放在一个List中)，每个学生有一个姓名属 性(String)班级名称属性(String)和考试成绩属性(double)
//    某次考试结 束后，每个学生都获得了一个考试成绩。遍历list集合，并把学生对象 的属性打印出来，使用冒泡或者选择排序进行排序输出。
        public static void main(String[] args) {
            List<Student> list=new ArrayList<>();
            list.add(new Student("jack","01",100));
            list.add(new Student("rose","02",99.89));
            list.add(new Student("as","01",99.79));
            list.add(new Student("rqw","04",99.89));
            list.add(new Student("jqw","03",99.99));
            list.add(new Student("rortewse","02",99.89));
            list.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return Double.compare(o1.getScore(),o2.getScore());
                }
            });
            System.out.println(list);


        }

        static class Student{
            private String name;
            private String className;
            private double score;
            public Student(){}
            public Student(String name, String className, double score) {
                this.name = name;
                this.className = className;
                this.score = score;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getClassName() {
                return className;
            }

            public void setClassName(String className) {
                this.className = className;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", className='" + className + '\'' +
                        ", score=" + score +
                        '}'+"\n";
            }
        }
}
