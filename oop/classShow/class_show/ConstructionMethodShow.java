package oop.classShow.class_show;

public class ConstructionMethodShow {
    int a ;
    int b;
    int c;

    String d;
    String e;


    ConstructionMethodShow(int x, int y){
        // 这是一个演示用的构造方法，用于初始化实例变量
        a = x;
        b = y;
        c = x * y;
    }

    ConstructionMethodShow(String s1, String s2){
        d = s1;  // 这里是另一个构造方法，用来演示构造方法的重载
        e = s2;
    }

    int add(){  // 实例方法访问实例变量
        return a + b;
    }

    String name(){
        return d + " " + e;
    }
}
