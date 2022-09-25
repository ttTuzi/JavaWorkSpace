package MianXiangDuiXiang.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}

abstract class D{
    public int a;
    public static String name="Wei";
    public void hi(){
        System.out.println("hi!");
    }
    public abstract void hello();
    public static void ok(){
        System.out.println("ok");
    }
}

abstract class E{
    public abstract void hi();
}
abstract class F extends E{

}
class G extends E{
    public void hi(){

    }
}
abstract class H{
    //错误的写法,不能被static,final,private 修饰
    //public static abstract void hi();
    //private abstract void hi();
}