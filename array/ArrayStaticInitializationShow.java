package array;

import java.util.Date;

public class ArrayStaticInitializationShow {
    public static void main(String[] args) {
        int[] intArray = {3, 5, 8, 9, 10};  // 整数数组
        float[] floatArray = {3.8F, 6.8F, 9.5F};  // 浮点数数组
        String[] stringsArray = {"再见", "太阳系"}; // 字符串数组
        Date[] dataArray = {};

        for (String i : stringsArray){
            System.out.println(i);
        }
    }
}
