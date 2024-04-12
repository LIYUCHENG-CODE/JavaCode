package Base;

public class ReferenceTypeShow {
    public static void main(String[] args) {
        int x = 7;
        int y = x;

        System.out.println(y);

        String str1 = "Hello";
        String str2 = str1;
        str2 = "World";
        System.out.println(str2);

    }
}
