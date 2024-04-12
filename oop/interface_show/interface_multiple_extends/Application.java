package oop.interface_show.interface_multiple_extends;

public class Application {
// 这是个演示接口多继承的类
    public static void main(String[] args) {
        System.out.println("实现interfaceA中的抽象方法");
        interfaceA p1 = new Ellipse();
        p1.onDraw();
        p1.show();
        System.out.println("---------------------------------");
        // p1.clear(); 编译错误   因为接口interfaceA中并没有定义抽象方法clear
        /*
          接口可以多继承。所以当创建实例发生多态时，若父类的接口没有这个抽象方法，即便创建了这一实例,也没有办法调用该方法
         */
        Ellipse p2 = new Ellipse();  // 因为数据类型和实例的类型一致。在这里没有使用多态。故而直接调用了实例Ellipse的方法
        p2.clear();

        System.out.println("----------------------------------");
        System.out.println("实现interfaceB中的抽象方法");
        interfaceB p3 = new Ellipse();
        p3.clear();  // 因为接口中定义了抽象方法clear  Ellipse实现了clear方法 所以多态对象也能调用方法clear



    }

}
