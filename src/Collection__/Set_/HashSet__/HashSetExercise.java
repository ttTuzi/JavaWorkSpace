package Collection__.Set_.HashSet__;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月07日 4:23 PM
 */

//定义employee类
//包含name,age
//要求:
    //1.创建3个Employee对象放入到Hashset中
    //2.当name和age的值相同时,认为是相同的员工,不能添加到Hashset中
public class HashSetExercise {
    public static void main(String[] args) {
        //思路:
        //重写equals方法和hash,比较age
        Employee wei = new Employee("wei", 10);
        Employee john = new Employee("angel", 10);
        Employee angel = new Employee("angel", 20);
        HashSet hashSet = new HashSet();
        hashSet.add(wei);
        hashSet.add(john);
        hashSet.add(angel);
        System.out.println(hashSet);
    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public boolean equals(Employee employee) {
        return this.age==employee.age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
