package control;

public class ContinueShow {
    public static void main(String[] args) {
        int[] a = {3, 5, 7, 9, 1};
        for (int j : a) {
            if (j == 7){
                continue;  // 如果条件符合跳过本次循环，但不会破坏整个循环
            }
            System.out.println(j);
        }
    }
}