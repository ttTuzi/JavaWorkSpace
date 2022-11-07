package Collection__.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月07日 2:36 PM
 */
public class SetMethod {
    public static void main(String[] args) {
        //Set和List不同,Set是无序的
        //不可以通过索引查找
        //不可以重复,如果重复只会有一个
        //输出的顺序和存放的顺序毫无关系
        //虽然和存放的顺序无关,但是每次输出的顺序是一致的
        //不能通过普通的for循环来遍历,因为没有索引
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("jack");
        set.add("john");
        set.add(null);
        set.add(null);
        System.out.println(set);
        System.out.println("================");

        //遍历Set

        //1.迭代器
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("==================");

        //2.增强for
        for (Object o : set) {
            System.out.println(o);
        }

    }
}
