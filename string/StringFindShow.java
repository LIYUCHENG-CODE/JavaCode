package string;
// 这个类演示的是字符串对特定索引或字符的查找
public class StringFindShow {
    public static void main(String[] args) {
        String s = "There is a string accessing example";  // 创建字符串常量
        int len = s.length();  // 获取字符串长度
        char ch = s.charAt(16);  // 获取指定索引的字符串中的的字符
        System.out.println("字符串长度 " + len);
        System.out.println("索引16对应的字符 " + ch);

        int findChar1 = s.indexOf('r');  // 从前往后找r所在的索引
        System.out.println("从前往后查找字符r的索引 " + findChar1);

        int findChar2 = s.lastIndexOf('r');  // 从后往前找r所在的索引

        System.out.println("从后往前查找r的字符索引 " + findChar2);

        int findChar3 = s.lastIndexOf('r', 4);  // 从后往前找r所在的索引
        System.out.println(findChar3);
    }
}
