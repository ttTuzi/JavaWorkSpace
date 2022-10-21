package MianXiangDuiXiang.MianXiangDuiXiangPractice.HomeWork;

// 1.有一个交通工具接口类Vehicles,有work接口
// 2. 有Horse类和Boat类分别实现Vehicles
// 3.创建交通工具工厂类,有两个方法分别获得交通工具Horse和Boat
// 4. 有Person类,有name和Vehicles属性,在构造器中为两个属性赋值
// 5.实例化Person对象“唐僧”,要求一般情况下用Horse作为交通工具,遇到大河时用Boat作为交通工具
// 5.过火焰山,使用飞机
public class HomeWork06 {
    public static void main(String[] args) {
        Person Tang = new Person("唐僧", new Boat());
        Tang.common();
        Tang.passRiver();
        Tang.mountain();
    }
}

interface Vehicles{
    public void work();
}

class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("正在使用马...");
    }
}

class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("正在使用船...");
    }
}

class Airplane implements Vehicles{
    @Override
    public void work() {
        System.out.println("正在使用飞机...");
    }
}

class Factory{
    //马儿始终是同一匹马
    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Airplane getAirplane(){
        return new Airplane();
    }
}

class Person{
    String name;
    Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        if (vehicles == null || !(vehicles instanceof Boat)){
            vehicles=Factory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if (vehicles == null || !(vehicles instanceof Horse)){
            vehicles=Factory.getHorse();
        }
        vehicles.work();
    }
    public void mountain(){
        if (vehicles == null || !(vehicles instanceof Airplane)){
            vehicles=Factory.getAirplane();
        }
        vehicles.work();
    }
}