package MianXiangDuiXiang.MianXiangDuiXiangPractice;

import java.util.Scanner;

public class constructorAndThis {
    public static void main(String[] args) {
        Person p1 = new Person(20, "Wei");
        Person p2 = new Person(20, "Wei");
        Person p3 = new Person(30, "Wei");
        Person person = new Person();
        
        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
        Scanner myScanner = new Scanner(System.in);

    }
}

//定义person类
//包含age,name
//提供compareTo,比较和另一个的名字和属性是否一致
class Person {
    int age;
    String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean compareTo(Person p1) {
        if (p1.age == this.age && p1.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }

}