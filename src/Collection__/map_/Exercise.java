package Collection__.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月09日 3:08 PM
 */

//
public class Exercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        Employee employee = new Employee("john",30000);
        Employee employee1 = new Employee("lucy",32000);
        Employee employee2= new Employee("eric", 13900);
        map.put(employee.getID(),employee);
        map.put(employee1.getID(),employee1);
        map.put(employee2.getID(),employee2);
        Set keyset = map.keySet();
        for (Object o : keyset) {
            Employee emp = (Employee) map.get(o);
            if(emp.getSalary()>18000){
                System.out.println(emp.toString());
            }
        }
    }
}

class Employee{
    private String name;
    private double salary;
    private static int id=0;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = id + 1;
        this.ID=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}