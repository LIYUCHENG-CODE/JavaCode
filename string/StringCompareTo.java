package string;
// 这是一个演示字符串比较大小的类
public class StringCompareTo {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Swift");

        System.out.println(s1.compareTo(s2));  //  如果比参数字符串大返回的值是个正数,如果如果小则为负数,若相等则为0

    }
}
