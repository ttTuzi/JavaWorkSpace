package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月10日 5:30 PM
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        int x = maxSubArray(arr);
        System.out.println(x);
    }
    public static int maxSubArray(int[] nums){
        //base case when length <1
        //return the number
        if(nums.length<=1){
            return nums[nums.length-1];
        }

        int max = nums[0]; //set initial max equals first element
        int sum =0;        //let initial sum = 0;
        //iterate the array
        for(int i = 0;i<nums.length;i++){
            if(sum<0){  //when sum <0, it means if you add up two number, it will be smaller
                sum = nums[i];  //so, just forget sum ,let it be the current element
            }else {    //if sum => 0
                sum = sum + nums[i]; // update sum
            }
            max = Math.max(max,sum); //compare the number each time, keep max
        }
        //max = Math.max(max,sum+nums[nums.length-1]);
        return max;
    }
}
