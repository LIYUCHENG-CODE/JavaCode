package control;

public class SwitchIntShow {
    public static void main(String[] args) {
        int x = 70;
        switch (x){
            case 90:
                System.out.println("优");

            case 80:
                System.out.println("良");

            case 70:
                System.out.println("不足");

            case 60:
                System.out.println("差");

            default:
                System.out.println("无法判断");
        }

    }
}
