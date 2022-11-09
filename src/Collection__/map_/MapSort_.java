package Collection__.map_;

import java.io.ObjectStreamException;
import java.util.*;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月09日 2:24 PM
 */
public class MapSort_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘凌波",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");

        //第一组: 先取出所以的key,再通过key,取出value
        //(1)增强for
        Set keyset =map.keySet();

        for (Object o : keyset) {
            System.out.println(o+"--"+map.get(o));
        }
        System.out.println("====================");
        //(2)迭代器
        Iterator iterator = keyset.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key+"--"+map.get(key));
        }
        System.out.println("==================");

        //第二组: 把所有的values取出,然后遍历,只能输出value,不能输出key
        Collection value = map.values();
        //(1)增强for
        for (Object o : value) {
            System.out.println(o);
        }
        System.out.println("===========");
        //(2)迭代器
        Iterator iterator1 = value.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //第三组:通过EntrySet来获取Key-Value
        //以后学完数据结构再来学

    }
}
