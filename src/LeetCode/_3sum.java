package LeetCode;

import java.util.*;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月09日 8:22 PM
 */
public class _3sum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(Integer[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> list= new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else {
                    k--;
                }
            }
        }
        List<List<Integer>> output = new ArrayList<>();
        output.addAll(ans);
        return output;
    }
}
