package oop.interface_show.InterfaceToInterfaceExtends;

public interface Paint {
    void onDraw();// 在画布上画
    void show();
    void clear();  // 清除画布

    // 接口中的静态方法
    static void print(){
        System.out.println("Hello");
    }



}
