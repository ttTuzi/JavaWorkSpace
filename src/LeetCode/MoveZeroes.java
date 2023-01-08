package LeetCode;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月26日 10:11 PM
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,3,0,0,0,6,0,0,1,1};
        //moveZeroes(nums);
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]==0) {
                j=i;
                while(nums[j]==0 && j<nums.length){
                    j++;
                }
                nums[i]=nums[j];
                nums[j]=0;
                if(j==nums.length-1){
                    break;
                }
            }
                i++;

        }
    }
    public static void moveZeroes2(int[] nums) {
        int count=0;//to count non 0 appears
        for(int i =0;i< nums.length;i++){
            //once non 0 appears, put it to index count, and look for next non 0.
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        //we find all the non 0s, and put them at front in order
        //then we set rest all 0
        for(int i=count;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
