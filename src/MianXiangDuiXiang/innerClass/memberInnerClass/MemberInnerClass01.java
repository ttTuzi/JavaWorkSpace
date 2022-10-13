package MianXiangDuiXiang.innerClass.memberInnerClass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //外部其他类访问===>成员内部类
        //第一种方法
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        //外部其他类访问===>成员内部类
        //第二种方法,在外部类中写一个访问内部类的方法
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
    }
}

/**
 * 成员外部类是定义在外部类的成员位置
 * 没有static修饰
 * 1.可以访问外部类所以成员,包括私有的
 * 2.可以添加任意修饰符(public,protected,private)
 */

class Outer08 { //外部类
    private int n1 = 10;
    public String name = "张三";

    /*

     */
    class Inner08 {//成员内部类
        public void say() {
            System.out.println("n1 = " + n1 + "name = " + name);
        }

    }
    //方法二
    public Inner08 getInner08Instance(){
        return new Inner08();
    }
    public void t1(){
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}