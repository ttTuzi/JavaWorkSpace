package LeetCode;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2022年12月27日 1:33 PM
 */
public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        int res = peakIndexInMountainArray(nums);
        System.out.println(res);

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int  h= arr.length-1;
        while(l<=h){
            if(l==h){
                return l;
            }
            int m = l+h >>>1;
            if(arr[m]<arr[m+1]){
                l = m +1;
            } else if (arr[m]>arr[m+1]) {
                h = m;
            }
        }

        return l;
    }
}
