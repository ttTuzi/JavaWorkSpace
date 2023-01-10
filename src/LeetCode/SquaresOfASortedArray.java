package LeetCode;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月26日 2:35 PM
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] res = sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortedSquares(int[] nums) {
        int l=0;
        int r= nums.length-1;
        int index = nums.length-1;
        int[] res = new int[nums.length];
        while(l<=r){
            if(Math.abs(nums[l])>=Math.abs(nums[r])){
                res[index] =(int)Math.pow(Math.abs(nums[l]),2);
                l++;
                index--;
            }else {
                res[index] =(int)Math.pow(Math.abs(nums[r]),2);
                r--;
                index--;
            }
        }
        return res;
    }
}
