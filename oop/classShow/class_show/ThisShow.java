package oop.classShow.class_show;

public class ThisShow {
    String name;
    int age;

    ThisShow(String name, int age){

        this.name = name;  // 若构造方法的形参名和变量名相同，需要this关键字来指明这是赋值给属性name的
        this.age = age;
    }

    void print(){
        System.out.println("name: "+ this.name);
        System.out.println("age: " + this.age);
    }


    public static void main(String[] args) {
        ThisShow obj = new ThisShow("Alice", 18);
        obj.print();
    }
}
