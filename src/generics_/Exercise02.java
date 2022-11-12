package generics_;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月11日 1:32 PM
 */
public class Exercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("john",2800,new MyDate(2000,5,31)));
        employeesList.add(new Employee("alex",2800,new MyDate(2000,11,2)));
        employeesList.add(new Employee("brown",2800,new MyDate(2009,7,6)));
        employeesList.add(new Employee("tim",2800,new MyDate(1996,8,1)));
        employeesList.add(new Employee("john",2800,new MyDate(1990,12,13)));
        System.out.println(employeesList);
        System.out.println("--------------");
        //自定义比大小
        employeesList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int i = o1.getName().compareTo(o2.getName());
                if(i!=0){
                    return i;
                }
                return o1.getBirthDay().compareTo(o2.getBirthDay());
                //可以把接下来的代码放在MyDate里做比较
//                int y = o1.getBirthDay().getYear()-o2.getBirthDay().getYear();
//                if(y!=0){
//                    return y;
//                }
//                int m = o1.getBirthDay().getMonth()-o2.getBirthDay().getMonth();
//                if(m!=0){
//                    return m;
//                }
//                int d = o1.getBirthDay().getDay()-o2.getBirthDay().getDay();
//                if(d!=0){
//                    return d;
//                }
//                return 0;
            }
        });
        System.out.println(employeesList);

    }
}

class Employee{
    private String name;
    private double sal;
    private MyDate birthDay;

    public Employee(String name, double sal, MyDate birthDay) {
        this.name = name;
        this.sal = sal;
        this.birthDay = birthDay;
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

    public MyDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(MyDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthDay=" + birthDay +
                '}'+"\n";
    }
}

class MyDate implements Comparable<MyDate>{
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
        return  year +
                "--" + month +
                "--" + day;
    }

    @Override
    public int compareTo(MyDate o) {
        int y = this.getYear()-o.getYear();
        if(y!=0){
            return y;
        }
        int m = this.getMonth()-o.getMonth();
        if(m!=0){
            return m;
        }
        int d = this.getDay()-o.getDay();
        if(d!=0){
            return d;
        }
        return 0;
    }
}
