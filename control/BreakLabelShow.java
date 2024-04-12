package control;

public class BreakLabelShow {
    public static void main(String[] args) {
        label1: for (int x = 0;  x < 5; x++) {
            for (int y = 5; y > 0 ; y--) {
                if (y == x){
                    break label1;  // 默认情况下break循环是终结最近那层循环，但有了label标签就可以指定终止那一层循环
                }
                System.out.printf("(x, y) = ( %d, %d)\n", x, y);
            }

        }
    }
}
