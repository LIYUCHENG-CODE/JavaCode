package oop.classShow.class_show;

public class ConstructionMethodShowMain {


    public static void main(String[] args) {
        /*
        * 同一个引用类型 因为构造方法不同，当给这个类的参数输入不同类型或者不同个数参数时，java会选择最适应的构造方法初始化实例变量
        * */
        ConstructionMethodShow obj2 = new ConstructionMethodShow(10, 20);
        System.out.println(obj2.add()); //
        ConstructionMethodShow obj = new ConstructionMethodShow("Li", "YuCheng");
        System.out.println(obj.name());  //

    }
}
