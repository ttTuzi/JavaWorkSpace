package Collection__.Set_.LinkedHashSet__;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月07日 5:19 PM
 */
public class LinkedHashSet_ {
    public static void main(String[] args) {
        //讲解:
        //和HashSet不同的是,LinkedHashSet是有序的
        //在table中,LinkedHashSet是由数组 + 双向链表组成的
        //有索引
        //heHashSet一样,不能有重复的元素
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(356);
        set.add(356);
        set.add(new Customer("溜",1001));
        set.add(123);
        set.add("wie");
        System.out.println(set);
    }
}

class Customer {
    private String name;
    private int No;

    public Customer(String name, int no) {
        this.name = name;
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", No=" + No +
                '}';
    }
}
