package LeetCode.dynamicProgramming;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年04月11日 12:45 PM
 */
public class Nth_Tribonacci_Number {
    public static void main(String[] args) {
        int result = tribonacci(25);
        System.out.println(result);
    }

    public static int tribonacci(int n){
        int[] dp = new int[3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        if (n<2){
            return n;
        }
        if(n==2){
            return 1;
        }

        for (int i = 3; i <= n; i++) {
            int curr = dp[0]+dp[1]+dp[2];
            dp[0]=dp[1];
            dp[1]=dp[2];
            dp[2]=curr;
        }
        return dp[2];
    }
}
