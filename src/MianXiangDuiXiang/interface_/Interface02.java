package MianXiangDuiXiang.interface_;

public class Interface02 {
    public static void main(String[] args) {
        a a = new a();
        a.hi();
        AInterface.ty();
    }
}

interface AInterface{
    //写属性
    //写方法
    public  int a =10;
    public void hi();
    default public void ok(){
        System.out.println("ok...");
    }
    public static void ty(){
        System.out.println("thank you...");
    }
}

//如果一个类implement接口
//那所以的抽象方法就需要实现
class a implements AInterface{
    @Override
    public void hi() {
        System.out.println("hi");
    }
}