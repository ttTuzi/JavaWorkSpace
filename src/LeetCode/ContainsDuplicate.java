package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * Input: nums = [1,2,3,1]
 * Output: true
 * Input: nums = [1,2,3,4]
 * Output: false
 * @author: Wei Liang
 * @date: 2022年12月09日 8:55 PM
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    //O(N),O(N)
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
