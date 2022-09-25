package MianXiangDuiXiang.poly.objectpoly;

public class PolyObject {
    public static void main(String[] args) {
        //编译类型是Animal, 运行类型是Dog
        Animal animal = new Dog();
        animal.cry(); //因为运行时，animal运行类型是Dog，所以cry是dog的cry.

        animal = new Cat();
        animal.cry();//因为运行时，animal运行类型是Cat，所以cry是dog的cry.

    }
}
