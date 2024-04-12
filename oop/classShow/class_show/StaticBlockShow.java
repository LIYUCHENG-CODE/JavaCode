package oop.classShow.class_show;

public class StaticBlockShow {
        // 静态变量声明
        static String name;
        static int age;
        static String sex;
        static String school;
        // int classroom;

        // 静态代码块
        static {
                /*
                * 静态代码块用于初始化静态变量,只执行一次
                 */

                name = "Li";
                age = 17;
                sex = "man";
                school = "WenHua";

        }

        //
        public static void main(String[] args) {
                System.out.println(name);
                System.out.println(age);
                System.out.println(sex);
                System.out.println(school);

        }
}
