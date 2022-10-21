package MianXiangDuiXiang.MianXiangDuiXiangPractice.HomeWork;

//按要求实现下列问题:
// 1. 动物类Animal包含了抽象方法shout()
// 2. Cat类继承了Animal,并实现方法shout,打印“猫会喵喵叫”
// 3. Dog类继承了Animal,并实现方法shout,打印“狗会汪汪叫”
// 4.在测试类中实例化对象Animal cat =new Cat(),并调用cat的shout方法
// 5,在测试类中实例化对象Animal dog=new Dog.并调用dog的shout方法
public class HomeWork03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}
abstract class Animal{
    public abstract void shout();
}

class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}
