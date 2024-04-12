package oop.classShow.extend;

public class Student extends Person{  // 1. 声明继承关系
    private String school;
    private int age;
    Student(String name, int age, String sex, String school){  // 将父类构造方法的形参和子类新添的参数全部填进去
        /*
         * super要写在第一行
         */

        super(name, age, sex);  // 这里填写父类构造方法的参数
        this.school = school;
        this.age = age;
    }
    /*
    /

    public int getAge(){
        return age + 5;
    }
*/

    public static void main(String[] args) {
        Student obj = new Student("Li", 18, "man", "龙中");
        System.out.println(obj.getAge());
        Person obj2 = new Person("Kali", 18, "women");
        System.out.println(obj2.getAge());
    }
}
