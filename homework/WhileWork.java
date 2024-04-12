package homework;

public class WhileWork {
    public static void main(String[] args) {
        int count = 100, a = 1, b = 0, c = 0;
        while (count < 1000){
            // 检查各位数的立方之和是否等于这个数
            if(((a*a*a) + (b * b * b) +(c * c *c)) == count ){
                System.out.println(count);  // 如果满足条件打印输出这个数
            }
            // 检查个位数是否满足进位条件
            if (c == 9){
                b += 1; // 满足十位数进一位
                c = 0;  // 并且将个位数数字归零
            } else {
                c++;  // 如果不满足个位数+1
            }
            if (b == 9){  // 如果十位数等于9
                a++;  // 百位数进一
                b = 0; //并且将个位数归零

            }
            count++;  // 将这三个数同步统计出来
            // System.out.printf("a:%d b:%d c:%d count %d \n", a,b,c,count);
        }
    }
}
