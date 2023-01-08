package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月23日 9:02 PM
 */
public class BinarySearch {
    public static void main(String[] args) {

    }
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (high>=low){
            int mid = low+high >>> 1;
            if(target<nums[mid]){
                high = mid -1;
            }else if (target>nums[mid]){
                low = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
