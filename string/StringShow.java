package string;
// 这个类演示如何创建字符串对象
public class StringShow {
    public static void main(String[] args) {
        // 创建字符串对象
        String s1 = new String();  // 使用空字符串创建并初始化一个新的String对象
        String s2 = new String("Hello World!");  // 使用另外一个字符串创建并初始化一个新的字符串对象
        String s3 = new String("\u0048");  // 通过Unicode创建新的字符串对象

        // 通过字符创建字符串
        char[] c = {'你','e', 'l','l','o'};
        String s4 = new String(c);
        System.out.println(s4);
        String s5 = new String(c, 1, 4);
        System.out.println(s5);

        //通过字节创建字符串

        byte[] b = {97, 98, 99};
        String s6 = new String(b);
        System.out.println(s6);
        byte b2 = (byte) 'a';  // 字符转化为byte类型a对应的是97所以
        System.out.println(b2);





    }
}
