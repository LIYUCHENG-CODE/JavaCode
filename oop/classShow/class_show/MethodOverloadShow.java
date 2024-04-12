package oop.classShow.class_show;
// 方法重载
public class MethodOverloadShow {
// 两个相同名字的方法因为参数类型不同而不同，这就是方法的重载
    int add(int x, int y){
        int result;
        result = x + y;
        return result;
    }
    void add(double x, double y){
        System.out.println(x + y);

    }


    public static void main(String[] args) {
        MethodOverloadShow obj = new MethodOverloadShow();
        System.out.println(obj.add(10, 15));
        obj.add(10.0, 50.0);
    }


}
