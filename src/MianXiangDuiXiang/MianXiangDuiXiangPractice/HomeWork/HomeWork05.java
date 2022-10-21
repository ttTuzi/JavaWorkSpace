package MianXiangDuiXiang.MianXiangDuiXiangPractice.HomeWork;

//内部类
// 1.编一个类A,在类中定义局部内部类B,B中有一个私有常量name,有一个方法show()打印常量name。进行测试
// 2.进阶: A中也定义一个私有的变量name, 在show方法中打印测试
public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.setName("Wei");
        a.method();
    }
}

class A{
    private String name;
    public void method(){
        class B{
            private String name="Liang";
            public void show(){
                System.out.println(this.name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }

    public void setName(String name) {
        this.name = name;
    }
}