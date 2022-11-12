package Collection__.collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月09日 4:07 PM
 */
public class CollectionTools {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("jack");
        list.add("smith");
        list.add("king");
        list.add("milan");

        //reverse
        Collections.reverse(list);
        System.out.println(list);

        //shuffle
        //随机排序
        Collections.shuffle(list);
        System.out.println(list);

        //sort
        Collections.sort(list);
        System.out.println(list);

        //swap
        Collections.swap(list,0,1);
        System.out.println(list);

        //

    }
}
