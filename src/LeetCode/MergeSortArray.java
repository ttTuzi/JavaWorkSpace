package LeetCode;

/**
 * @Description:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * @author: Wei Liang
 * @date: 2022年12月10日 7:17 PM
 */
public class MergeSortArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};

        merge(num1,3,num2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
//        int l=0;
//        int r=0;
//        int p =0;
//        int[] nums3 = new int[m];
//        for(int i =0 ;i<m;i++){
//            nums3[i] = nums1[i];
//        }
//        while(l<m && r<n){
//            if(nums3[p]<=nums2[r]){
//                nums1[p]=nums3[l];
//                l++;
//            }else{
//                nums1[p]=nums2[r];
//                r++;
//            }
//            p++;
//        }
//        while(l<m){
//            nums1[p]=nums3[l];
//            l++;
//            p++;
//        }
//        while(r<n){
//            nums1[p]=nums2[r];
//            r++;
//            p++;
//        }

        //以上的代码是从前往后排,这样需要extra space and time
        //如果从后往前就不用
        int l = m-1; //nums1 最后一个有用的element's index
        int r = n-1; //nums2 最后一个index
        int p = m+n-1;  //pointer point to last index for nums1
        //check l and r >=0
        //if yes compare which is bigger, and write it to nums1[p]
        while(l>=0 && r>=0){
            if(nums1[l]>=nums2[r]){
                nums1[p]=nums1[l];
                l--;
            }else {
                nums1[p]=nums2[r];
                r--;
            }
            p--;
        }
        //if l pointer done, then just copy remaining nums2 to nums1
        while(r>=0){
            nums1[p]=nums2[r];
            p--;
            r--;
        }
        //if l pointer not done, just keeps it, because it means it is sorted.
    }
}
