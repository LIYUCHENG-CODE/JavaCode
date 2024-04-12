package operator;

public class BinaryOperator {
    // 二元赋值运算符
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        String c = "演示字符串";
        System.out.println(a+b);  // 求和
        System.out.println(c + a);  // 连接字符串
        System.out.println(a - b);  // 求差
        System.out.println(a * b);  // 求积
        System.out.println((float) a / b);  // 求商
        System.out.println(a % b);  // 求余数
    }
}
