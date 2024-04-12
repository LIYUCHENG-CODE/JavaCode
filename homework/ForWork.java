package homework;

public class ForWork {
    public static void main(String[] args) {
        int a = 1, b = 0, c = 0;
        for (int i = 100; i < 1000; i++) {
            if (((a * a * a) + (b * b * b) + (c * c * c)) == i) {
                System.out.println(i);  // 如果满足条件打印输出这个数
            }
            // 检查个位数是否满足进位条件
            if (c == 9) {
                b += 1; // 满足十位数进一位
                c = 0;  // 并且将个位数数字归零
            } else {
                c++;  // 如果不满足个位数+1
            }
            if (b == 9) {  // 如果十位数等于9
                a++;  // 百位数进一
                b = 0; //并且将个位数归零
            }
        }
    }
}
