package oop.interface_show.InterfaceToInterfaceExtends;

public class Ellipse implements Figure{
    /*
    如果实现的接口是某一接口的子接口，则必须要实现
    这个接口的所有方法以及它父类接口的全部方法
     */

    // paint和Figure均对show有定义。故而当在Ellipse实现时
    // 对两个接口同时进行覆写
    public void show(){
        System.out.println("显示图像");
    }

    /**
     * onDraw和clear方法均是只在父类接口Paint定义的，
     * 我们要实现了子类接口，不仅要将Figure中的方法实现，
     * 还需要将它父类接口的方法也要实现。
     */
    public void onDraw(){
        System.out.println("绘制椭圆形");
    }

    public void clear(){
        System.out.println("清除图像");
    }

}
