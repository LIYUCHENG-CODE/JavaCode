package oop.interface_show.interface_multiple_extends;

public class Ellipse implements interfaceA,interfaceB{
    @Override
    public void show() {
        System.out.println("显示图形");  // 这是个在抽象方法中
    }

    @Override
    public void onDraw() {
        System.out.println("绘制椭圆形");
    }

    @Override
    public void clear() {
        System.out.println("清除");
    }


}
