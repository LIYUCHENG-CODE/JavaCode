package oop.classShow.extend;

public class Person {
    private String name;
    private int age;

    private String sex;

    // 三个参数构造方法
    public Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }


}
