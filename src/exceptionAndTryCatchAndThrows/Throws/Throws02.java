package exceptionAndTryCatchAndThrows.Throws;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年10月22日 3:24 PM
 */
public class Throws02 {
    public static void main(String[] args) {
        f2();
    }
    public static void f2(){
        //1.对于编译异常,程序必须要处理,比如TryCatch, throws
        //2.对于运行异常,程序如果没有处理,默认就是throws的方式处理
        //4.写了throws就不要写TryCatch了
        int n1=10;
        int n2=0;
        double res = n1/n2;
    }

}
class Father{
    public void method() throws RuntimeException{

    }
}

class Son extends  Father{
    //3.子类重写异常的方法时,对抛出的子类的规定: 子类重写的方法
    // 所抛出的异常类型要么和父类抛出的异常一致,要么为父类抛出的异常的子类型
    //NullPointerException是RuntimeException的子类, 如果为Exception,那么就会出错
    @Override
    public void method() throws NullPointerException/*,Exception*/{

    }
}


