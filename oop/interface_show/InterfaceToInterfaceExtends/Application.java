package oop.interface_show.InterfaceToInterfaceExtends;

public class Application {
    public static void main(String[] args) {
        Figure p = new Ellipse();
        p.show();  // paint和Figure均对show有定义
        p.onDraw();
        p.clear();
        Paint.print();  // 调用
    }
}
