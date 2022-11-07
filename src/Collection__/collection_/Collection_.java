package Collection__.collection_;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月06日 3:23 PM
 */
public class Collection_ {
    public static void main(String[] args) {
        //Collection
        //解读:
        //1.集合主要是两组(单列,双列)
        //2.Collection 接口有两个主要的子接口: List Set. 他们的子类都是单列集合
        //3.Map 的子类 是双列集合

        //单列
        ArrayList arrayList = new ArrayList();
        arrayList.add("Jack");
        arrayList.add("Tom");

        //双列
        HashMap hashMap = new HashMap();
        hashMap.put("NO1","北京");
        hashMap.put("NO2","上海");
    }
}
