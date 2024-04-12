package control;

public class ContinueLabelShow {
    public static void main(String[] args) {
        label1: for (int x = 0; x < 6; x++) {
            for (int y = 6; y > 0 ; y--) {
                if (x == y){
                    continue label1;  //  假如x=y 就跳过大循环，然后继续执行循环
                }
                System.out.printf("(x,y) = (%d,%d) \n", x, y);
            }
        }
    }
}
