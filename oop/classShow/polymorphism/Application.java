package oop.classShow.polymorphism;
public class Application {
    public static void main(String[] args) {
        System.out.println("//演示多态");
        Figure f1 = new Triangle();
        Figure f2 = new Ellipse();
        f1.onDraw();
        f2.onDraw();
        System.out.println("------------------------------");
        System.out.println("//演示使用instanceof判断对象是否属于某个引用类型");
        //  使用instanceof判断对象是否属于某个引用类型
        System.out.println(f1 instanceof Triangle);
        System.out.println(f1 instanceof Figure);
        System.out.println(f1 instanceof Ellipse);
        System.out.println("------------------------------");





    }
}
