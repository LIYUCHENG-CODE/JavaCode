package control;

public class ElseIfShow {
    public static void main(String[] args) {
        int score = 90;
        if (score >= 90){
            System.out.println("成绩优秀");
        } else if (score>=80){
            System.out.println("成绩良好");
        } else if (score>=60) {
            System.out.println("成绩合格");
        } else if (score<60) {
            System.out.println("成绩不合格");
        }
    }
}
