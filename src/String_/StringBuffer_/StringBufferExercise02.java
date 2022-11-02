package String_.StringBuffer_;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年10月31日 12:32 PM
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        //通过用户输入的数字
        //将数字插入逗号
        //比如 : 123456.78 --> 123,456.78
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(str);
        //思路:
        //1.找到小数点的位置
        //2.在小数点的钱前3位输入逗号
        //3.重复第二步骤
        int i = stringBuffer.indexOf(".")-3;
        for (int j=0;j<i;i=i-3) {
            stringBuffer.insert(i,",");
        }
        System.out.println(stringBuffer);
    }
}
