package MianXiangDuiXiang.Extend_;
/*
    继承的本质
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name); //—-》就近原则
        System.out.println(son.age); //-->返回的父类
        System.out.println(son.hobby); //-->返回爷类
    }
}

class Grandpa{
    String name ="大头爷爷";
    String hobby = "旅游";
}
class Father extends Grandpa{
    String name = "大头爸爸";
    int age = 29;
}
class Son extends Father{
    String name = "大头儿子";
}
