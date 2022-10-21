package MianXiangDuiXiang.MianXiangDuiXiangPractice.HomeWork;

//1.计算器接口具有work方法,功能是运算,有一个手机类Cellphone,定义方法testWork测试计算功能,调用计算接口的work方法,
// 2.要求调用CellPhone对象 的testWork方法,使用上匿名内部类
public class HomeWork04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        double result = cellphone.testWork(new Calculator_() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },7,8);
        System.out.println(result);
    }

}

interface Calculator_{
    public double work(double n1, double n2);
}

class Cellphone{
    public double testWork(Calculator_ c,double n1,double n2){
        double result=c.work(n1,n2);
        return result;
    }
}
