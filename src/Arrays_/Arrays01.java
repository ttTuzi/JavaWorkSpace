package Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年10月31日 2:22 PM
 */
public class Arrays01 {
    public static void main(String[] args) {
        Integer[] integers = {1,20,43,2,42,657,32,34,34,31};
        Integer[] integers1 = {1,20,43,2,42,657,32,34,34,31};
        //1.toString
        System.out.println(Arrays.toString(integers));

        //2.sort
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        //3.拷贝指定长度
        Integer[] newArr = Arrays.copyOf(integers,integers.length);
        System.out.println(Arrays.toString(newArr));

        //4.对比是否一样,顺序重要
        System.out.println(Arrays.equals(newArr,integers1));



    }
}
