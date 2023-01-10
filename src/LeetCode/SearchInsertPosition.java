package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月24日 6:57 PM
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        int result = searchInsert(nums, 2);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid=-1;
        while (high > low) {
            mid = low + high >>> 1;
            if (target < nums[mid]) {
                high = mid - 1;
            }
            if (target > nums[mid]) {
                low = mid + 1;
            }
            if (target == nums[mid]) {
                return mid;
            }
        }
        return (nums[low]>=target) ? low : low+1;

    }
}
