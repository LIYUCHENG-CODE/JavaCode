package oop.classShow.extend;

public class Student2 extends Person2{
    private int classNumber;
    public Student2(int classNumber){
        this.classNumber = classNumber;
    }

    public static void main(String[] args) {
        Student2 obj = new Student2(3);
        System.out.println(obj.getName());
    }
}
