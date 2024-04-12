package oop.interface_show.interface_implements;
// 接口声明关键字为interface
public interface Figure {
    String name = "几何图形";  // 省略了public static final 修饰符，
    ;
    // 在interface中 没有实例成员变量，只有静态常量
    // 没有构造方法

    /*
    public static void main(String[] args) {
        name = "图形";  编译出错 因为name是常量，一旦赋值不能更改
        System.out.println(name); 没有实例化对象也能运行 证明name是个静态常量
    }
    */
    void onDraw();  // 绘制图形 抽象方法

    void show();  // 显示图像

    default void getInterfaceName(int x){
        int y = x + 10;  // 接口中的实例变量
        System.out.println(name);
        System.out.println(y);
    };  // 绘制图形  具体方法
}
