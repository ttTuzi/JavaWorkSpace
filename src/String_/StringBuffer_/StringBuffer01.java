package String_.StringBuffer_;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年10月31日 11:53 AM
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        //构造器的使用
        //解读:
        //1.创建一个 大小为 16 的 char[], 用于存放字符内容
        StringBuffer stringBuffer01 = new StringBuffer();

        //2.通过构造器 来指定容量的大小
        StringBuffer stringBuffer02 = new StringBuffer(100);

        //3.通过构造器来输入String,大小根据输入的String的大小+16 hell0=5, +16=21, 大小21
        StringBuffer stringBuffer03 = new StringBuffer("hello");
        System.out.println(stringBuffer03);

    }
}
