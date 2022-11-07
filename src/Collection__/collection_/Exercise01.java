package Collection__.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月06日 4:54 PM
 */
public class Exercise01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小盒",20.2));
        list.add(new Dog("小百",22.7));
        list.add(new Dog("小起",17.3));

        //增强for
        for (Object dog : list) {
            System.out.println("使用增强for: "+dog.toString());
        }

        //迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("迭代器: "+iterator.next().toString());
        }
    }
}

class Dog{
    private String name;
    private double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}


