package String_;

import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {
        //reverse a string, can modify the length
        String str = "abcdefg";
        String s=reverse_(str,2,str.length()-2);
        System.out.println("交换前"+str);
        System.out.println("交换后"+s);
    }

    public static String reverse_(String str, int start, int end) {
        if(str !=null && start>=0 && start<str.length()-1 && end>start) {
            char[] c = str.toCharArray();
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
            return new String(c);
        }else{
            throw new RuntimeException("异常");
        }
    }
}
