package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月25日 2:52 PM
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        int res = pivotIndex(nums);
        System.out.println(res);
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        int l = 0;
        for(int i = 0; i<nums.length;i++){
            if(i!=0) {
                l = nums[i-1] + l;
            }else{
                l=0;
            }
            int r = sum - l - nums[i];
            if(l==r){
                return i;
            }
        }
        return -1;
    }
}
