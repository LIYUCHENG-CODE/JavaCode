package oop.classShow.abstract_class;

public  class Ellipse extends Figure{  // 只有抽象类才能继承抽象类

    public void onDraw(){
        System.out.println("绘制椭圆形");
    }

    public static void main(String[] args) {
        // Figure obj = new Figure();  // 抽象类不能被实例化
        Figure obj = new Ellipse();
        obj.onDraw();

    }
}
