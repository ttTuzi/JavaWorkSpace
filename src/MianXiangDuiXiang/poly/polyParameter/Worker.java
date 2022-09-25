package MianXiangDuiXiang.poly.polyParameter;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("普通员工 "+getName()+" is working");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();

    }
}
