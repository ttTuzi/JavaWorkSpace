package MianXiangDuiXiang.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args){
        //抽象类不能被实例化
        //A a = new A();
    }
}

//抽象类不一定要包含abstract方法.
//也就是说abstract class可以没有abstract方法
//还可以有实例的方法

abstract class A{
    public void hi(){
        System.out.println("hello!");
    }
}