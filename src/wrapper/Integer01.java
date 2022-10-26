package wrapper;

/**
 * @Description: 演示装箱,拆箱
 * @author: Wei Liang
 * @date: 2022年10月22日 4:38 PM
 */
public class Integer01 {
    public static void main(String[] args) {
        //其他Wrapper类似
        //演示int <--> Integer
        //jdk5.0之前是手动装箱,拆箱
        //手动装箱
        int n1 =300;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        int i = integer.intValue();

        //jdk5之后自动装箱和拆箱
        int n2 = 200;
        //自动装箱
        Integer integer2 = n2; //底层使用的是 Integer.valueOf()

        //自动拆箱
        int n3 = integer2;//底层使用的是 Integer.valueOf()
    }
}
