package Collection__.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月06日 3:43 PM
 */
public class CollectionMethod {
    public static void main(String[] args) {
        //存储的是对象,而不是数据类型.
        List list = new ArrayList();
        list.add("jack");//是new String("jack");
        list.add(10);//是new Integer("10");
        list.add(true);//是new Boolean(true);
        System.out.println("list: " + list);
        list.remove(0);
        System.out.println(list.contains("jack"));
        System.out.println(list.size());
        list.remove("jack");
        System.out.println("list: " + list);
        list.clear();
        System.out.println("list: "+list);
        List list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("list: "+list);
        list.removeAll(list2);
        list.add("水浒传");
        System.out.println("list: "+list);



    }
}
