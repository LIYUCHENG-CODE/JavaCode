package control;

public class BreakShow {
    public static void main(String[] args) {
        int[] numbers = {4,6,3,8,1,5};
        for(int i : numbers){  // 遍历数组
            if(i == 3){  // 当i遍历到3时 用break破坏for循环  这是没有标签的
                break;
            }
            System.out.println(i);
        }
    }
}
