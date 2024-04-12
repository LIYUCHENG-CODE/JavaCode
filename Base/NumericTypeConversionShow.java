package Base;

public class NumericTypeConversionShow {
    public static void main(String[] args) {
        byte a = 16;
        short b =16;
        int c = 16;
        long d = 16;
        char e = 'A';
        float f = 16F;
        double g = 16;

        System.out.println(a + c); // byte类型自动转化为int类型

        byte h = (byte) d;  // 将long类型强制转化为byte类型
        System.out.println(h);

        System.out.println();
        System.out.println("转化前 " + (c / 7));  // 如果不转化 会出现精度问题

        /*
        转换后
         */
        double j = (double) c / 7;  // 强制转换类型
        System.out.println("转化后 " + j);
    }
}
