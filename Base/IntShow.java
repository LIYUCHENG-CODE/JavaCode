package Base;

public class IntShow {

    public static void main(String[] args) {
        byte a = 127;  //  字节类型 占用1字节(8位） 范围 -2^7~2^7-1
        short b = 16;  // 短类型  占用字节2(16位)  范围 -2^15 ~ 2^15-1
        int c = 16;  // 整型 占用字节4（32位） 范围 -2^31 ~ 2^31 -1   java整数类型的默认类型
        long d = 16L;   // 长类型 占用8字节（64位） 范围 -2^63 ~ -2^63 -1  长类型声明变量时需要在数值后面添加L

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}
