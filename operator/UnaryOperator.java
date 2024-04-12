package operator;

public class UnaryOperator {
    // 一元赋值运算符
    public static void main(String[] args) {
        int a = 12;
        /* - 取反*/
        System.out.println("对a取反： " + -a);
        System.out.println();
        /*
          ++ 自增
         */

        // 先赋值在自增 a++
        int b = a++;  // 先赋值，在自增加1  先把 12 赋值给b
        System.out.println("初始值a的值为" + a);
        System.out.println("此时b的值为： " + b); // 所以此时 b = 12
        System.out.println("此时a的值为： " + a);  // 然后自增 此时a = 12 + 1 =`13
        System.out.println();
        //  先自增再赋值 ++c
        int c = 12;
        int d = ++c;
        System.out.println();
        System.out.println("" + c);
        System.out.println("" + d);
    }


}
