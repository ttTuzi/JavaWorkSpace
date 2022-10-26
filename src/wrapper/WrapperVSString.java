package wrapper;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年10月22日 4:47 PM
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer)->String
        Integer i = 100;//自动装箱
        //方式1
        String str1 = i + "";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);

        //String -> Integer
        String str4 = "1234";
        //方式1
        Integer i2 = Integer.parseInt(str4);
        //方式2
        Integer i3 = Integer.valueOf(str4);
    }
}
