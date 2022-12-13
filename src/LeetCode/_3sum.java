package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月09日 8:22 PM
 */
public class _3sum {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> threeSum(Integer[] nums){
        Arrays.sort(nums);

        int i=0,j=1,k=2;
        List<Integer> Is = new ArrayList<>();
        List<List<Integer>> Os = new ArrayList<>();
        while(nums[i]!=nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k] ){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum==0){
                Is.add(nums[i]);
                Is.add(nums[j]);
                Is.add(nums[k]);
            }
        }
        return null;
    }
}
