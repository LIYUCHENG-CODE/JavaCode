package string;
// 这个类演示字符串的拼接方法
public class StringConcatShow {
    public static void main(String[] args) {
        // 使用+运算符连接字符串
        String s1 = "Hello";
        String s2 = "world";
        String s3 = " ";

        System.out.println(s1 + " " + s2);

        // 使用concat方法链接两个字符串
        System.out.println(s1.concat(s3.concat(s2)));
    }
}
