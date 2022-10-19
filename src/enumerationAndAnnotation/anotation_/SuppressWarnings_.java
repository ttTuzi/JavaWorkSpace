package enumerationAndAnnotation.anotation_;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings_ {
    //解读
    //1. 当我们不希望看到警告的时候,可以使用SuppressWaring注解来抑制警告信息
    //2. 在{""}中, 可以写入你希望抑制的警告信息
    //3. 作用范围和你放置的位置有关,如果放置main方法那抑制的范围就是main方法
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list  = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));

    }

    public static void m1(){
        List list  = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));
    }

}
