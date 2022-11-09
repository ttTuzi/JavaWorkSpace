package Collection__.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月09日 1:57 PM
 */
public class Map_ {
    public static void main(String[] args) {
        //Map接口实现类的特点
        //1.用于保存具有映射关系的数据. Key-Value
        //2.底层是hash,所以是无序的
        //3.当有相同的Key是,value是会被替换的
        //4.value可以重复,但key不可以
        //5.可以存在null key,但只能存在一个
        //6.通过get方法输入key能找到value

        //重点:
        //Key和Value都是储存在Node这个内部类
        //为了方便遍历,把key的地址放在Set
        //把value的地址放在Collection
        Map hashMap = new HashMap();
        hashMap.put("no1", "hsp");
        hashMap.put("no2", "zwj");
        hashMap.put("no1", "zsf");
        hashMap.put("no3", "zsf");
        System.out.println(hashMap.get("no1"));
        System.out.println(hashMap);
    }
}
