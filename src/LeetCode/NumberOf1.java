package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月10日 8:39 PM
 */
public class NumberOf1 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(110000));
        System.out.println(9>>>1);
    }
    //not working in idea, have treat n as binary
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count = count + (n&1);

            n = n>>>1;
        }
        return count;
    }
}
