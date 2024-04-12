package Base;

public class DoubleShow {
    public static void main(String[] args) {
        float a = 3.14F;  // 单精度浮点数类型 4字节32位 需要在值后面加上F
        double b = 3.14;  // 双精度浮点数类型  8字节 64位  后面的D是可选的
        double c = 3.14D; //

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
