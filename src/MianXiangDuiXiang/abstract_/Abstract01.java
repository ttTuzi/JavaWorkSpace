package MianXiangDuiXiang.abstract_;

public class Abstract01 {
}

abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //思考: 这里实现eat没有什么用
    //即: 父类方法不确定性
    //===> 考虑将该方法设计为抽象方法(abstract)
    //===> 所谓抽象方法就是还没实现的方法
    //===> 没有实现就是指,没有方法体
    //===> 当一个类中纯在抽象的方法,类就必须为抽象类
    //===> 一般来说抽象类会被子类继承
//    public void eat(){
//        System.out.println("这是一个动物,不知道吃什么");
//    }

    //一旦方法抽象了,类也要抽象
    public abstract void eat();

}