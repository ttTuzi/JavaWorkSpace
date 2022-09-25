package MianXiangDuiXiang.innerClass;

public class LocalInnerClass {
    /*
     *演示局部内部类
     */
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02{//外部类
    private int n1 =100;
    private void m2(){
        System.out.println("outer02 m2()");
    }
    public void m1(){
        //1.局部内部类通常都在外部类的方法中
        //3.不能添加访问修饰符,但可以用final修饰
        //4.final不能被继承
        //5.作用域:仅仅在定义它的方法体或者代码块中
        class Inner02{//局部内部类(本质还是一个类)
            //2.可以访问外部类的所以成员包括私有的
            private int n1 =200;
            public void f1(){
                System.out.println("内部类的n1="+n1+", 外部类的n1="+Outer02.this.n1);
                m2();
            }
        }
        class Inner03 extends Inner02{

        }
        //6.在外部类的方法中可以创建Inner class的对象,然后调用方法
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }


}
