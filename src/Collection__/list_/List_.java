package Collection__.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月06日 5:09 PM
 */
public class List_ {
    public static void main(String[] args) {
        //1.
        //添加顺序和取出顺序一致
        //并且可以重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("eric");
        System.out.println(list);

        //2.
        //List中的每个元素都有其对应的顺序索引
        System.out.println(list.get(2));
        System.out.println(list.indexOf("tom"));

        //3.支持插入元素到任意index
        list.add(2,"angel");
        System.out.println(list);

        //4.支持删除
        list.remove(2);
        System.out.println(list);


        //5.替换已经存在的元素
        list.set(2,"angel");
        System.out.println(list);

        //6.


    }
}
