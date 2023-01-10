package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月24日 7:42 PM
 */
public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] result = twoSum(nums,17);
        System.out.println(result[0]+""+result[1]);
    }

    //O(n) time
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] =map.get(target-nums[i]);
                result[1] =i;
                return result;
            }else {
                map.put(nums[i],i );
            }
        }
        return result;
    }
}
