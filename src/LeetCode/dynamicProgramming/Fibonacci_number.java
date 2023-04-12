package LeetCode.dynamicProgramming;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年04月11日 12:36 PM
 */
public class Fibonacci_number {
    public static void main(String[] args) {

    }

    public int fib(int n){
        if(n<2){
            return n;
        }

        int prev0=0;
        int prev1=1;
        for (int i = 1; i < n; i++) {
            int curr = prev0+prev1;
            prev0=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
