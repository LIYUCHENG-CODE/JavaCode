package oop.interface_show.interface_implements;

public class Ellipse implements Figure {
    @Override
    public void onDraw() {
        System.out.println("绘制椭圆");
    }

    @Override
    public void show() {
        System.out.println("显示图像");
    }

}
