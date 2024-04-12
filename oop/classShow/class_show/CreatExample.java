package oop.classShow.class_show;

public class CreatExample {

    String helloWorld = new String("Hello World");
    static String str; // 只声明，没有初始化值

    public static void main(String[] args) {

        System.out.println(str); // 没有用new关键字分配内存空间，直接输出这个对象是个空对象
    }

}
