package Collection__.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月06日 4:48 PM
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("红楼梦","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));
        //还可以使用增强for来循环
        //增强for底层还是迭代器
        //增强for是简化版的迭代器
        //快捷键I,或者col.for
        for(Object book : col){ //冒号前面是需要取出的元素类型,冒号后面是需要出去的对象
            System.out.println(book.toString());
        }
    }
}
