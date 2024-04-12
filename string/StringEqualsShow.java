package string;
// 这个类演示比较两个类的值是否相等
public class StringEqualsShow {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        // System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s3 == s4);
    }

}
