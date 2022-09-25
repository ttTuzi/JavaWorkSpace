package MianXiangDuiXiang.innerClass;

/**
 *
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 100;

    public void method() {
        //基于接口的密名内部类
        //解读
        //1.需求: 想使用接口A,并创建对象
        //2.传统方式就是写一个类实现该接口,并创建对象
//        Tiger tiger = new Tiger();
//        tiger.cry();
        //3.需求是Tiger这个类只使用一次,不在使用
        //4.可以使用密名内部类来简化开发
        //5.tiger的编译类型是A,
        //6.运行类型是密名内部类 xxxx=>Outer class name + $1. Ex:Outer04$1
        /*
         *底层
         class Outer04$1 implements IA{
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
         }
         */
        A tiger = new A(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
    }
}

interface A {
    public void cry();
}
//class Tiger implements A{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤...");
//    }
//}
//class dog implements A{
//    @Override
//    public void cry() {
//        System.out.println("小狗汪汪叫");
//    }
//}
class Father {
    public Father(String name) {
    }

    public void test() {
    }
}