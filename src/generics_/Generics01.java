package generics_;

import java.util.ArrayList;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年11月11日 12:32 PM
 */
public class Generics01 {
    public static void main(String[] args) {
        //泛型是约束
        //当一个class后边加了泛型,在泛型中指定类型
        //那么就只能使用这个类型
        //不能使用基本数据类型(int,double,boolean...)
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(8);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}
