package MianXiangDuiXiang.innerClass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        Outer05 p2 = new Outer05(){
            @Override
            public void f1() {
                System.out.println("weo");
            }
        };
        p2.f1();
    }
}

class Outer05{
    private int n1=99;
    public void f1(){
        Person p = new Person(){
            @Override
            public void hi() {
                System.out.println("密名hi"+n1);
            }
        };
        p.hi();
//        new Person(){
//            @Override
//            public void hi() {
//                System.out.println("密名hi2");
//            }
//        }.hi();
    }
}

class Person{
    public void hi(){
        System.out.println("hi");
    }
}