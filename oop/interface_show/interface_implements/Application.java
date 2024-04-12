package oop.interface_show.interface_implements;

public class Application {
    // 接口的实现
    public static void main(String[] args) {
        Figure f1 = new Ellipse();  // 子类继承父类并且实现了父类的抽象方法 发生多态
        Figure f2 = new Triangle();  // 同上
        f1.onDraw();
        f2.onDraw();
    }
}
