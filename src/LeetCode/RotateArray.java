package LeetCode;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月26日 3:03 PM
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
    public  static void rotate(int[] nums, int k) {
        if(k>nums.length){
            k=(k%nums.length);
            k = nums.length-k;
        }
            int[] rp = new int[nums.length-k];
            int i = 0;
            while(i<rp.length){
                rp[i] = nums[i];
                i++;
            }
            i=0;
            k = nums.length-k;
            while(k<nums.length){
                nums[i]=nums[k];
                i++;
                k++;
            }
            int j=0;
            while(i< nums.length){
                nums[i]=rp[j];
                j++;
                i++;
            }
    }
}
