package oop.classShow.override;

public class Student extends Person{
    private String school;

    public Student(String name, int age, String school){
        super(name, age);
        this.school = school;
    }

    public String getSchool(){
        return this.school;
    }

}
