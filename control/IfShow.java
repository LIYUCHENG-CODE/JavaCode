package control;

public class IfShow {
    public static void main(String[] args) {
        int score = 95;

        if(score >= 90){
            System.out.println("您的成绩很优秀");
        }
        if (score < 90 && score >=80){   //
            System.out.println("您的成绩还有提升空间");
        }

        if (score < 80 && score>=60){
            System.out.println("您要加把劲");
        }

        if (score<60){
            System.out.println("成绩不合格");
        }


    }
}
