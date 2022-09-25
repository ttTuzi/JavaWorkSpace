package MianXiangDuiXiang.poly.polyParameter;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
    public void work(){
        System.out.println("经理 "+getName()+" is working");
    }
}
