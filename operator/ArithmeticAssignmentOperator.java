package operator;

public class ArithmeticAssignmentOperator {
    //  算数赋值运算符
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a += b;  // 相当于a = a + b   a = 1 + 2
        System.out.println(a);

        int c = 1;
        int d = 2;

        c -= d;  // 相当于 c = c - d  c = 1 - 2
        System.out.println(c);

        int e = 3;
        int f = 2;
        e *= f;  //
        System.out.println(e);
    }
}
