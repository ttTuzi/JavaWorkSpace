package String_.StringBuffer_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年10月31日 12:09 PM
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        String str = "hello Tom";
        //String to StringBuffer
        //方式一, 对String本身没影响
        StringBuffer stringBuffer = new StringBuffer(str);

        //方式二. 使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str);

        //StringBuffer to String
        StringBuffer stringBuffer3 = new StringBuffer("hello");

        //方式一. toString
        stringBuffer3.toString();

        //方式二.
        String s = new String(stringBuffer3);


    }
}
