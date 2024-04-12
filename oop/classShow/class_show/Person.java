package oop.classShow.class_show;

public class Person {
    private String name;  // 成员变量在类实例化后被称作实例的属性或对象的属性
    private int age;

    // 构造函数
    public Person(String name, int age) {
        this.name = name; // 使用 this 关键字引用当前对象的 name 属性
        this.age = age;   // 使用 this 关键字引用当前对象的 age 属性
    }

    // 方法，设置姓名
    public void setName(String name) {
        this.name = name; // 使用 this 关键字引用当前对象的 name 属性
    }

    // 方法，设置年龄
    public void setAge(int age) {
        this.age = age;   // 使用 this 关键字引用当前对象的 age 属性
    }

    // 方法，获取姓名
    public String getName() {
        return this.name; // 使用 this 关键字返回当前对象的 name 属性
    }

    // 方法，获取年龄
    public int getAge() {
        return this.age;  // 使用 this 关键字返回当前对象的 age 属性
    }

    // 方法，打印个人信息
    public void printInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
        // 使用 this 关键字引用当前对象的 name 和 age 属性
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        person1.printInfo(); // 调用对象的方法打印信息
        person2.printInfo(); // 调用对象的方法打印信息
    }
}

