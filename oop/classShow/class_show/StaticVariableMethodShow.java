package oop.classShow.class_show;
// 这个类演示没有public前缀的类声明
class StaticVariableMethodShow {
    // 不同封装方式的成员变量
   public int a = 10;
   private int b = 10;
   protected int c = 10;
   public static int e = 10;  // 静态变量也称作类变量
   int d = 10;
   final int F = 10;  // 常量
    public static void main(String[] args) {
        StaticVariableMethodShow obj = new StaticVariableMethodShow();
        System.out.println("------------------------------------------");
        System.out.println("public修饰符的成员变量： " + obj.a);
        System.out.println("private修饰符的成员变量： " + obj.b);
        System.out.println("protected修饰符的成员变量： " + obj.c);
        System.out.println("默认级别的成员变量： " + obj.d);
        System.out.println("静态成员变量： " + e);  // 静态方法可以直接调用静态变量
        System.out.println("------------------------------------------");

        //  obj.F = 20; final修饰符的变量不能被更改,被称作常量。
        System.out.print("静态main方法调用其他静态方法 'printHello' \t");
        printHello();
        System.out.println("------------------------------------------");
        obj.test();
    }
    // 演示静态方法
    static void printHello(){
        System.out.println("This is a static method");
    }

    void test(){
        System.out.println("实例方法test调用实例变量a " + a);
        test2();
    }

    void test2(){
        System.out.println("This is a test2");
    }


}