package debug;

import java.util.Arrays;

public class debug03 {
    public static void main(String[] args) {
        //看底层代码
        //用debug,F7跳入方法体内
        int[] arr = {1,-1,10,-20,100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
