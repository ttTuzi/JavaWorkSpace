package Collection__.Set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月07日 4:44 PM
 */

//1.定义employee类:
    //1.包含name,sal,birthday
    //2.birthday是MyDate类
    //3.MyDate是自己创建的,包含:year,month,day
//2.创建3个employee放入HashSet
//3.当name和birthday相同时,认为是相同员工,不能添加到HashSet

public class HashSetExercise2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add(new employee1("Wei",10000,new MyDate(2001,12,13))));
        System.out.println(hashSet.add(new employee1("Wei",50000,new MyDate(2001,12,13))));
        System.out.println(hashSet.add(new employee1("john",10000,new MyDate(2001,12,13))));
        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
}

class employee1{
    private String name;
    private double sal;
    private MyDate birthday;

    public employee1(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee1 employee = (employee1) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date: " +
                 year +
                "-" + month +
                "-" + day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}



