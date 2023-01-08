package LeetCode;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月25日 2:27 PM
 */
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] runningSum(int[] nums) {
        for(int i =1;i<nums.length;i++){
            nums[i] = nums[i]+nums[i-1];

        }
        return nums;
    }
}
