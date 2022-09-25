package MianXiangDuiXiang.abstract_.abstractPratice;

public class Practice01 {
    public static void main(String[] args) {
        Manager jack = new Manager("Jack", 12, 4000);
        jack.setBonus(5000);
        jack.work();

        commonEmployee tom = new commonEmployee("tom", 12, 20000);
        tom.work();

    }
}

abstract class Employee{
    private String name;
    private int ID;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    abstract public void work();

}

class Manager extends Employee{
    private double bonus;
    public Manager(String name,int ID,double salary,double bonus){
        super(name,ID,salary);
        this.bonus=bonus;
    }

    public Manager(String name, int ID, double salary) {
        super(name, ID, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("经理"+ getName()+"工作中");
    }
}

class commonEmployee extends Employee{
    public commonEmployee(String name, int ID, double salary) {
        super(name, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"工作中");
    }
}
