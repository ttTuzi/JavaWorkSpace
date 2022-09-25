package MianXiangDuiXiang.poly.polyParameter;

public class Test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("Milan", 5000, 200000);
        Test test = new Test();
        test.showEmpAnnual(tom);
        test.showEmpAnnual(milan);
        test.testWork(tom);
        test.testWork(milan);
    }

    //showEmpAnnual
    //获取任何员工的年工资
    public void showEmpAnnual(Employee e){
        //因为这是override
        //所以getAnnual方法是按照运行类型来进行动态编译
        System.out.println(e.getAnnual());
    }

    //调用子类私有方法
    public void testWork(Employee e){
        //因为这是子类私有的方法,但是编译对象是父类
        //所以需要向下转换
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if (e instanceof Manager){
            ((Manager)e).work();
        }else{
            System.out.println("wrong type");
        }
    }
}
