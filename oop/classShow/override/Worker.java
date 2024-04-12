package oop.classShow.override;

public class Worker extends Person{
    private String work;
    private String company;
    public Worker(String name, int age, String work, String company){
        super(name, age);
        this.work = work;
        this.company = company;
    }
    public String getWork (){
        return this.work;
    }

    public String getCompany(){
        return company;
    }
}
