package oop.classShow.override;

public class Application {
    public static void main(String[] args) {
        Person p = new Student("唐", 18, "柳高");
        Student p2 = new Student("冯", 17, "铁一");
        // -----------------------------------------------------------
        Person p3 = new Person("赵", 18);
        // -----------------------------------------------------------
        Person p4 = new Worker("孙", 42, "船长", "海航");
        Worker p5 = new Worker("钱", 22, "飞行员", "东航");

        Person p6 = (Person) p5;  // 将子类数据类型转换为父类数据类型
        // System.out.println(p6 instanceof Person);

        // Worker p7 = (Worker) p3;

        // System.out.println(p7 instanceof Person);




    }


}
