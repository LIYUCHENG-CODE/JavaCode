package array;

import java.util.Arrays;

public class ArrayDynamicInitializationShow {
    public static void main(String[] args) {
        int[] a = new int[10];  // 通过new关键字来初始化数组的长度
        for (int i = 0; i < 10; i++) {
            a[i] = i + 5;  // 将元素的值按照数组下标赋值
        }
        System.out.println(Arrays.toString(a));
    }
}
