package Base;

//  演示常量的用法
public class FinalShow {
    public static final int X = 10;  // 静态常量
    final int Z = 7;  // 全局常量
    public static void main(String[] args) {
        System.out.println(X);
        final int Y = 5;  // 局部常量
        System.out.println(Y);

        FinalShow obj = new FinalShow();
        System.out.println(obj.Z);
    }
}
