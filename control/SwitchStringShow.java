package control;

public class SwitchStringShow {

    public static void main(String[] args) {
        String name = "孙同学";
        String score;
        switch (name){
            case "张同学":
                score = "优";
                break;
            case "李同学":
                score = "良";
                break;
            default:
                score = "无";
                break;

        }
        System.out.println("该同学的成绩 " + score);
    }
}
