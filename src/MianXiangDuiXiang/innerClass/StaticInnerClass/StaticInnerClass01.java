package MianXiangDuiXiang.innerClass.StaticInnerClass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        //其他外部类访问内部类
        outer09.Inner09 inner09 = new outer09.Inner09();
    }
}

class outer09{
    private int n1 =10;
    private static String name ="张三";
    //静态内部类
    //1.发在外部类的成员位置
    //2.使用static修饰
    //3.可以直接访问外部类所以静态成员包括私有的(只可以访问静态成员,静态方法,因为静态类只可以访问静态)
    //4.可以添加任何访问修饰符
    //5.作用域:同其他成员
    static class Inner09{
        public void say(){
            //System.out.println(n1);
            System.out.println(name);
        }
    }

    public void m1(){
        Inner09 inner09 = new Inner09();
        inner09.say();
    }

}