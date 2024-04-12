package string;


public class StringOtherShow {
    public static void main(String[] args) {
        String s1 = "hello world";
        System.out.println(s1.toUpperCase());  // 将字符串对象所有字符变成大写

        String s2 = "HELLO";
        System.out.println(s2.toLowerCase());  // 将字符串对象中所有的字符变成小写

        String s3 = "    Hello World   ";
        System.out.println(s3);
        System.out.println(s3.trim());  // 将字符串前后空格除去
    }
}
